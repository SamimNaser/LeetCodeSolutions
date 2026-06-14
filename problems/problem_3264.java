
public class problem_3264 {

    public static int[] getMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                idx = i;
            }
        }

        return new int[]{min, idx};
    }

    public static int[] getFinalState(int[] nums, int k, int multiplier) {
        int arr[]; // takes pair (min,idx)
        for (int i = 0; i < k; i++) {
            arr = getMin(nums);
            nums[arr[1]] = arr[0] * multiplier;
            System.out.println("Nums :");
            for (int elem : nums) {
                System.out.println(elem);
            }
            System.out.println("-----");
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 3, 5, 6};
        int k = 5;
        int multiplier = 2;
        int[] t = getFinalState(nums, k, multiplier);
        for (int elem : t) {
            System.out.println(elem);
        }
    }
}
