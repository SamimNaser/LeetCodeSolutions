
public class problem_3536 {

    public int maxProduct(int n) {
        int max = -1;
        int maxs = -1;
        while (n > 0) {
            int digit = n % 10;
            if (digit > max) {
                maxs = max;
                max = digit;
            } else if (digit > maxs) {
                maxs = digit;
            }
            n /= 10;
        }
        return max * maxs;
    }
}
