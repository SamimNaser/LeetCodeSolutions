
public class problem_1313 {

    public static int[] decompressRLElist(int[] nums) {
        int len = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            len += nums[i];
        }
        int[] output = new int[len];
        int k = 0;

        for (int i = 0; i < nums.length; i = i + 2) {
            int freq = nums[i];
            int value = nums[i + 1];

            for (int j = 0; j < freq; j++) {
                output[k] = value;
                k++;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] k = decompressRLElist(nums);
        for (int elem : k) {
            System.out.println(elem);
        }
    }
}
