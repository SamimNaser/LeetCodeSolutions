
public class problem_3432 {

    public static int countPartitions(int[] nums) {
        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }

        int leftSum = 0;
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            leftSum += nums[i];
            int rightSum = totalSum - leftSum;

            if ((leftSum % 2) == (rightSum % 2)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {10, 10, 3, 7, 6};
        int k = countPartitions(nums);
        System.out.println(k);
    }
}
