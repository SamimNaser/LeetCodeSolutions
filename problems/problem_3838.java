
public class problem_3838 {

    public static String mapWordWeights(String[] words, int[] weights) {
        int sum;
        StringBuilder s = new StringBuilder(words.length);
        for (String word : words) {
            sum = 0;
            for (char ch : word.toCharArray()) {
                sum += weights[ch - 'a'];
            }
            int l = sum % 26;
            s.append((char) ('z' - l));
        }
        return s.toString();
    }

    public static void main(String[] args) {
        String[] words = {"abcd", "def", "xyz"};
        int[] weights = {5, 3, 12, 14, 1, 2, 3, 2, 10, 6, 6, 9, 7, 8, 7, 10, 8, 9, 6, 9, 9, 8, 3, 7, 7, 2};
        String k = mapWordWeights(words, weights);
        System.out.println(k);

    }
}
