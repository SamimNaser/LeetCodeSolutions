
public class problem_3760 {

    public static int maxDistinct(String s) {
        int[] arr = new int[26];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            arr[ch - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int k = maxDistinct("abab");
        System.out.println(k);
    }
}
