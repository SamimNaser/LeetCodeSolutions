

public class problem_3131 {

    public int addedInteger(int[] nums1, int[] nums2) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int num : nums1) {
            min1 = min1 < num ? min1 : num;
        }

        for (int num : nums2) {
            min2 = num < min2 ? num : min2;
        }

        return min2 - min1;
    }
}
