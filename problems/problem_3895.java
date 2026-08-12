
public class problem_3895 {

    public int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;
        for (int num : nums) {
            if (num == 0) {
                if (digit == 0) {
                    count++;
                }
                continue;
            }
            while (num != 0) {
                if (num % 10 == digit) {
                    count++;
                }
                num /= 10;
            }
        }
        return count;
    }
}
