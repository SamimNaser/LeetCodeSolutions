
public class problem_2997 {

    public static int minOperations(int[] nums, int k) {
        int temp = 1;
        for (int num : nums) {
            temp ^= num;
        }
        return Integer.bitCount(temp ^ k);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5};
        int k = 2;
        int l = minOperations(nums, k);
        System.out.println(l);
    }
}
