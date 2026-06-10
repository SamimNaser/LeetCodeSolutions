
public class problem_1021 {

    public static String removeOuterParentheses(String s) {
        StringBuilder str = new StringBuilder();
        int open = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                if (open > 0) {
                    str.append('(');
                }

                open++;
            } else {
                open--;

                if (open > 0) {
                    str.append(')');
                }
            }
        }

        return str.toString();
    }

    public static void main(String[] args) {
        String k = removeOuterParentheses("(()())(())(()(()))");
        System.out.println(k);
    }
}
