public class problem_3541 {
    public static int maxFreqSum(String s) {
        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        int maxV = 0;
        int maxC = 0;

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                maxV = Math.max(maxV, freq[i]);
            } else {
                maxC = Math.max(maxC, freq[i]);
            }
        }

        return maxV + maxC;
    }
    public static void main(String[] args) {
        int k = maxFreqSum("successes");
        System.err.println(k);
    }
}
