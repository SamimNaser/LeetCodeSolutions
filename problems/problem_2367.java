
public class problem_2367 {

    public static int arithmeticTriplets(int[] nums, int diff) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (contains(nums, nums[i] + diff) && contains(nums, nums[i] + 2 * diff)) {
                counter++;
            }
        }
        return counter;
    }

    private static boolean contains(int[] nums, int target) {
        for (int num : nums) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 4, 6, 7, 10};
        int diff = 3;
        int k = arithmeticTriplets(nums, diff);
        System.out.println(k);
    }
}
