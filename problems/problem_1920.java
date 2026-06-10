public class problem_1920 {
    public static int[] buildArray(int[] nums) {
        int output [] = new int [nums.length];
        for (int i = 0; i < nums.length; i++) {
            output[i] = nums[nums[i]];
        }
        return output;
    }
    public static void main(String[] args) {
        int num[] = {5,0,1,2,3,4};
        int n [] = buildArray(num);
        for (int i:n) {
            System.out.println(i);
        }

    }
}
