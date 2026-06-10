public class problem_1863 {
    public static int subsetXORSum(int[] nums) {
        return calculateXORSum(nums, 0, 0);
    }
    public static int calculateXORSum(int[] nums, int index, int currentXORvalue){
        if(index == nums.length){
            return currentXORvalue;
        }
        // include current element
        int i = calculateXORSum(nums, index+1, currentXORvalue ^ nums[index]);
        // exclude current element
        int j = calculateXORSum(nums, index+1, currentXORvalue);

        return i+j;
    }

    public static void main(String[] args) {
        int[] nums =  {5,1,6};
        int k = subsetXORSum(nums);
        System.err.println(k);
    }
}

