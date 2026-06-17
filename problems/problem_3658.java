
public class problem_3658 {

    public static int gcdOfOddEvenSums(int n) {
        int sumE = 0;
        int a = 2;
        int sumO = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            sumE += a;
            a = a + 2;
            sumO += b;
            b = b + 2;
            System.out.println("sum" + sumE + ":" + sumO);
        }
        System.out.println(a + ":" + b);
        // System.out.println(sumE + ":" + sumO);
        return gcd(sumE, sumO);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int k = gcdOfOddEvenSums(5);
        System.out.println(k);
    }
}
