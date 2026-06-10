public class problem_3190 {
    public static int minimumOperations(int[] nums) {
        int k = 0;
        for (int elem : nums) {
            if((elem%3) != 0){
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int[] nums = {3,6,9};
        int k = minimumOperations(nums);
        System.err.println(k);
    }
}
