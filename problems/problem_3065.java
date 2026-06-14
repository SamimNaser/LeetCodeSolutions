
public class problem_3065 {

    public static int minOperations(int[] nums, int k) {
        int count = 0;
        for (int elem : nums) {
            if (elem < k) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {2, 11, 10, 1, 3};
        int k = 10;
        int l = minOperations(nums, k);
        System.out.println(l);
    }
}
