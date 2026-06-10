public class problem_1929 {
    public static int[] getConcatenation(int[] nums) {
         int n = nums.length;
        int[] output = new int [2*n];
        System.arraycopy(nums, 0, output, 0, n);
        System.arraycopy(nums, 0, output, n, n);
        return output;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        int[] k = getConcatenation(nums);
        for (Object elem : k) {
            System.out.print(elem+" ");
        }
    }
}
