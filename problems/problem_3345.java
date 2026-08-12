
public class problem_3345 {

    public int smallestNumber(int n, int t) {
        for (int i = n; i < n + 10; i++) {
            int prod = 1;
            int icopy = i;
            while (icopy > 0) {
                int digit = icopy % 10;
                prod *= digit;
                icopy /= 10;
            }
            if (prod % t == 0) {
                return i;
            }
        }
        return -1;
    }
}
