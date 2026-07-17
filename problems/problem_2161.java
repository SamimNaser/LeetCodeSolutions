
public class problem_2161 {

    public static int[] pivotArray(int[] nums, int pivot) {
        int[] result = new int[nums.length];
        int index = 0;

        for (int num : nums) {
            if (num < pivot) {
                result[index++] = num;
            }
        }

        for (int num : nums) {
            if (num == pivot) {
                result[index++] = num;
            }
        }

        for (int num : nums) {
            if (num > pivot) {
                result[index++] = num;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {9, 12, 5, 10, 14, 3, 10};
        int pivot = 10;
        int[] k = pivotArray(nums, pivot);
        for (int elem : k) {
            System.out.println(elem);
        }
    }
}
