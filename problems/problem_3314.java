
import java.util.ArrayList;
import java.util.List;

public class problem_3314 {

    public static int[] minBitwiseArray(List<Integer> nums) {
        int[] output = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            int num = nums.get(i);
            int c = -1;
            for (int j = 0; j < num; j++) {
                if ((j | (j + 1)) == num) {
                    c = j;
                }
            }
            output[i] = c;
        }
        return output;
    }

    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>(List.of(2, 3, 5, 7));
        int[] k = minBitwiseArray(s);
        for (int elem : k) {
            System.out.println(elem);
        }
    }
}
