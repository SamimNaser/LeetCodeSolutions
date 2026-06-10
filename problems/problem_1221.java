public class problem_1221 {
    public static int balancedStringSplit(String s) {
        int balance = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                balance++;
            } else {
                balance--;
            }

            if (balance == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        int result = balancedStringSplit(s);
        System.out.println(result);
    }
}
