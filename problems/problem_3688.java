
public class problem_3688 {

    public static int evenNumberBitwiseORs(int[] nums) {
        int output = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                System.out.println(num);
                output = output | num; // bitwise OR - | 
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int k = evenNumberBitwiseORs(nums);
        System.out.println(k);
    }
}
