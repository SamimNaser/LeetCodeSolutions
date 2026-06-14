
public class problem_1662 {

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for (String str : word1) {
            s1.append(str);
        }

        for (String str : word2) {
            s2.append(str);
        }

        return s1.toString().equals(s2.toString());
    }

    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};

        boolean k = arrayStringsAreEqual(word1, word2);
        System.out.println(k);
    }
}
