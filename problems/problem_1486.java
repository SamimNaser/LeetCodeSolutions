
public class problem_1486 {

    public static int xorOperation(int n, int start) {
        int output = start;
        for (int i = 1; i < n; i++) {
            output ^= start + 2 * i;
        }
        return output;
    }

    public static void main(String[] args) {
        int k = xorOperation(4, 3);
        System.out.println(k);
    }
}
