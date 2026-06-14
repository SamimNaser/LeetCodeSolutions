
public class problem_1389 {

    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {

        }
        return output;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        int[] k = createTargetArray(nums, index);
        for (int elem : k) {
            System.out.println(elem);
        }
    }
}
