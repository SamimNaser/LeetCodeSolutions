public class problem_1512 {
    public static int numIdenticalPairs(int[] nums) {
        int output = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1 ; j < nums.length ;j++){
                if (nums[i] == nums[j]) {
                    output++;
                }
            }
        }
        return output;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int k = numIdenticalPairs(nums);
        System.out.println(k);
    }
}
