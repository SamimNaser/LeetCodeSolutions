
public class problem_1281 {

    public static int subtractProductAndSum(int n) {
        int sum = 0;
        int prod = 1;
        while (n > 0) {
            int d = n % 10;
            sum += d;
            prod *= d;
            n = n / 10;
        }
        return (prod - sum);
    }

    public static void main(String[] args) {
        int n = 234;
        int k = subtractProductAndSum(n);
        System.out.println(k);
    }
}
