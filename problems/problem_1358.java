
public class problem_1358 {

    public static int numberOfSubstrings(String s) {

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                if (sub.contains("a")
                        && sub.contains("b")
                        && sub.contains("c")) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "abcabc";
        int k = numberOfSubstrings(s);
        System.out.println(k);
    }
}
