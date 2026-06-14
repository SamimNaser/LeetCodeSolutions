
public class problem_1688 {

    public static int numberOfMatches(int n) {
        int sum = 0;
        while (n > 1) {
            if (n % 2 != 0) {
                sum += Math.floor(((n - 1) / 2));
                n = (n - 1) / 2 + 1;
            } else {
                sum += n / 2;
                n = n / 2;
            }
            System.out.println("n :" + n);
            System.out.println(sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        int k = numberOfMatches(7);
        System.out.println(k);
    }
}
