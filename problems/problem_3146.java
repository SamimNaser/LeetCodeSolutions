
public class problem_3146 {

    public static int findPermutationDifference(String s, String t) {
        int output = 0;
        for (int i = 0; i < s.length(); i++) {
            output += Math.abs(i - (t.indexOf(s.charAt(i))));
        }
        return output;
    }

    public static void main(String[] args) {
        int k = findPermutationDifference("abcde", "edbac");
        System.out.println(k);
    }
}
