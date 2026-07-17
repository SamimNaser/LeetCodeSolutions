
public class problem_633 {

    public static boolean judgeSquareSum(int c) {
        long upperLimit = (long) Math.sqrt(c);
        long lowerLimit = 0;
        boolean output = false;

        while (lowerLimit <= upperLimit) {
            long sum = (long) (upperLimit * upperLimit) + (long) (lowerLimit * lowerLimit);
            if (sum == c) {
                return true;
            } else {
                if (c > sum) {
                    lowerLimit++;
                } else {
                    upperLimit--;
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {
        boolean k = judgeSquareSum(3);
        System.out.println(k);
    }
}
