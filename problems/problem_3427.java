
public class problem_3427 {

    public static int subarraySum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int start = Math.max(0, i - nums[i]);
            for (int j = start; j <= i; j++) {
                sum += nums[j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1};
        int k = subarraySum(nums);
        System.out.println(k);
    }
}
