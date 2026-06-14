
public class problem_2000 {

    public static String reversePrefix(String word, char ch) {
        int idx = word.indexOf(ch);
        StringBuilder s = new StringBuilder(word.length());
        // for (int i = rev.length() - 1; i >= 0; i--) {
        //     s.append(rev.charAt(i));
        // }

        s.append(word.substring(0, idx + 1));
        s.reverse();
        s.append(word.substring(idx + 1));
        return s.toString();
    }

    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        String k = reversePrefix(word, ch);
        System.out.println(k);
    }
}
