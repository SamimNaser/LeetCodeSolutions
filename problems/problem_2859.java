
import java.util.List;

public class problem_2859 {

    public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (Integer.bitCount(i) == k) {
                sum += nums.get(i);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> nums = List.of(5, 10, 1, 5, 2);
        int k = 1;
        int l = sumIndicesWithKSetBits(nums, k);
        System.out.println(l);
    }
}
