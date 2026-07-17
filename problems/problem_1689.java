
public class problem_1689 {

    public static int minPartitions(String n) {
        int max = 0;
        for (char ch : n.toCharArray()) {
            final int digit = ch - '0';
            if (digit > max) {
                max = digit;
                if (max == 9) {
                    return 9;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int k = minPartitions("32");
        System.out.println(k);
    }
}
