
public class problem_53 {

    public static int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int num : nums) {
            currentSum += num;
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            // Kadane's algorithm -- if the current sum becomes -ve set it to zero 
            // if -ve -- we cant get max sum
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
