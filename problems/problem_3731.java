
import java.util.ArrayList;
import java.util.List;

public class problem_3731 {

    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> output = new ArrayList<>();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        boolean[] helper = new boolean[max + 1];
        for (int num : nums) {
            helper[num] = true;
        }

        for (int i = min; i <= max; i++) {
            if (!helper[i]) {
                output.add(i);
            }
        }
        return output;

    }
}
