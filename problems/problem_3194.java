
import java.util.Arrays;

public class problem_3194 {

    public static double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double minAvg = Double.MAX_VALUE;
        int j = nums.length - 1;

        for (int i = 0; i < nums.length / 2; i++) {
            double avg = (nums[i] + nums[j]) / 2.0;
            minAvg = Math.min(minAvg, avg);
            j--;
        }

        return minAvg;
    }

    public static void main(String[] args) {
        int[] nums = {7, 8, 3, 4, 15, 13, 4, 1};
        double k = minimumAverage(nums);
        System.out.println(k);
    }
}
