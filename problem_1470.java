public class problem_1470 {
    public static int[] shuffle(int[] nums, int n) {
        int[] output = new int [nums.length];
        for (int i = 0; i < n; i++) {
            output[2 * i] = nums[i];
            output[2 * i + 1] = nums[n + i];
        }
        return output;
    }
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int[] k = shuffle(nums, 3);
        for (int elem : k) {
            System.err.println(elem);
        }
    }
}
