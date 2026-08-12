
public class problem_1979 {

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (min > num) {
                min = num;
            }
            if (max < num) {
                max = num;
            }
        }
        return gcd(min, max);
    }
}
