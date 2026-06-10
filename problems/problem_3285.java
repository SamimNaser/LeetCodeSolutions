
import java.util.ArrayList;
import java.util.List;

public class problem_3285 {

    public static List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> output = new ArrayList<>();
        for (int i = 1; i < height.length; i++) {
            if (height[i - 1] > threshold) {
                output.add(i);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        List<Integer> k = new ArrayList<>();
        int[] height = {1, 2, 3, 4, 5};
        int threshold = 2;
        k = stableMountains(height, threshold);
        System.out.println(k);
    }
}
