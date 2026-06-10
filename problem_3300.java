import java.util.Arrays;

public class problem_3300 {
    public static int minElement(int[] nums) {
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int elem = nums[i];
            int sum = 0;
            while (elem > 0){
                sum += elem%10;
                elem = elem/10;
            }
            output[i] = sum;
        }
        Arrays.sort(output);
        return output[0];
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int k = minElement(nums);
        System.err.println(k);
    }
}
