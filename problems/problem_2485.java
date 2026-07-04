
public class problem_2485 {

    public static int pivotInteger(int n) {
        int sum1 = 0;
        for (int i = 1; i <= n; i++) {
            sum1 += i;
            int sum2 = 0;
            for (int j = i; j <= n; j++) {
                sum2 += j;
            }
            System.out.println("sum1 : " + sum1);
            System.out.println("sum2 :" + sum2);
            if (sum1 == sum2) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int k = pivotInteger(8);
        System.out.println(k);
    }
}
