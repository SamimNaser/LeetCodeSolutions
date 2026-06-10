public class problem_2574 {
    public static int[] leftRightDifference(int[] nums) {
        int[] output = new int[nums.length];
        int n = nums.length;
        int sumR = 0;
        int sumL = 0;
        for(int elem : nums){
            sumR += elem;
        }

        for(int i = 0;i<n ;i++){
            sumR -= nums[i];
            output[i] = Math.abs(sumL - sumR);
            sumL += nums[i];
        }

        return output;
    }
    public static void main(String[] args) {
        int[] nums = {1};
        int[] k = leftRightDifference(nums);
        for (int elem : k) {
            System.err.println(elem);
        }
    }
}
