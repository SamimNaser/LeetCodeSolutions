
public class problem_628 {

    public int maximumProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int maxs = Integer.MIN_VALUE;
        int maxt = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int mins = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num < min) {
                mins = min;
                min = num;
            } else if (num < mins) {
                mins = num;
            }
            if (num > max) {
                maxt = maxs;
                maxs = max;
                max = num;
            } else if (num > maxs) {
                maxt = maxs;
                maxs = num;
            } else if (num > maxt) {
                maxt = num;
            }
        }

        int case1 = max * min * mins;
        int case2 = max * maxs * maxt;

        return case1 > case2 ? case1 : case2;

    }
}
