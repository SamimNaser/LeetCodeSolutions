
public class problem_3467 {
    public static int[] transformArray(int[] nums) {
        int count = 0;
        int[] output = new int [nums.length];
        for (int elem : nums) {
            if (elem % 2 == 0){
                count++;
            }
        }

        for(int i = 0 ;i<count ;i++){
            output[i] = 0;
        }
        for(int i = count ;i<nums.length;i++){
            output[i] = 1;
        }

        return output;
    }
    public static void main(String[] args) {
        int[] nums = {4,3,2,1};
        int[] k = transformArray(nums);
        for (Object elem : k) {
            System.err.println(elem);
        }
    }
}
