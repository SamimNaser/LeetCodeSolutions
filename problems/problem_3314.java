
import java.util.ArrayList;
import java.util.List;

public class problem_3314 {

    public static int[] minBitwiseArray(List<Integer> nums) {
        int[] output = new int[nums.size()];

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
