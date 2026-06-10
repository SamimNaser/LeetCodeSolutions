
public class problem_1365 {

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
            output[i] = count;
        }
        return output;
    }

    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        int[] k = smallerNumbersThanCurrent(nums);
        for (int elem : k) {
            System.out.println(elem);
        }
    }
}
