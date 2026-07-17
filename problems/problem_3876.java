
import java.util.Arrays;

public class problem_3876 {

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public long gcdSum(int[] A) {
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            max = Math.max(max, A[i]);
            A[i] = gcd(A[i], max);
        }

        Arrays.sort(A);

        long res = 0;
        for (int i = 0, j = A.length - 1; i < j; i++, j--) {
            res += gcd(A[i], A[j]);
        }

        return res;
    }
}
