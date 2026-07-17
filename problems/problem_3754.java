
public class problem_3754 {

    public static long sumAndMultiply(int n) {
        long num = 0;
        int count = 1;
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            if (d != 0) {
                sum += d;
                num += d * count;
                count *= 10;
            }
            n = n / 10;
        }
        return num * sum;
    }

    public static void main(String[] args) {
        long k = sumAndMultiply(999999999);
        System.out.println(k);
    }
}
