
public class problem_3069 {

    public int[] resultArray(int[] nums) {
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];

        int lastelem1;
        int lastelem2;
        int idx1 = 0;
        int idx2 = 0;

        arr1[idx1++] = nums[0];
        arr2[idx2++] = nums[1];

        lastelem1 = nums[0];
        lastelem2 = nums[1];

        for (int idx = 2; idx < nums.length; idx++) {
            if (lastelem1 > lastelem2) {
                arr1[idx1++] = nums[idx];
                lastelem1 = nums[idx];
            } else {
                arr2[idx2++] = nums[idx];
                lastelem2 = nums[idx];
            }
        }

        for (int i = 0; i < idx2; i++) {
            arr1[idx1++] = arr2[i];
        }

        return arr1;
    }
}
