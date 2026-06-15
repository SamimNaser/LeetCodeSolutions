
import java.util.Arrays;

public class problem_2974 {

    public static int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i += 2) {
            int c = nums[i] + nums[i + 1];
            nums[i] = c - nums[i];
            nums[i + 1] = c - nums[i + 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {5, 4, 2, 3};
        int[] k = numberGame(nums);
        for (int elem : k) {
            System.out.println(elem);
        }
    }
}
