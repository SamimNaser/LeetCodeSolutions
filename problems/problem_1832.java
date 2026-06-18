
public class problem_1832 {

    public static boolean checkIfPangram(String sentence) {
        boolean[] isThere = new boolean[26];
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            isThere[ch - 'a'] = true;
        }
        for (boolean elem : isThere) {
            if (elem == false) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean k = checkIfPangram("leetcode");
        System.out.println(k);
    }
}
