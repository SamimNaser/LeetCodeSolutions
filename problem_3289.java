public class problem_3289 {
    public static int[] getSneakyNumbers(int[] nums) {
        int[] output = new int[2];
        int[] counts = new int [nums.length-2];
        int index = 0;

        for (int elem : nums) {
            counts[elem]++;
            if(counts[elem] == 2){
                output[index++] = elem;
            }
            if(index == 2){
                break;
            }
        }
        return output;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,1,0};
        int[] k = getSneakyNumbers(nums);
        for (Object elem : k) {
            System.err.println(elem);
        }
    }
}
