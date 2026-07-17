
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class problem_1292 {

    public static List<Integer> sequentialDigits(int low, int high) {
        List<Integer> output = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            int num = i;
            for (int j = i + 1; j <= 9; j++) {
                num = num * 10 + j;
                if (num >= low && num <= high) {
                    output.add(num);
                }
            }
        }
        Collections.sort(output);
        return output;
    }

    public static void main(String[] args) {
        List<Integer> k = sequentialDigits(100, 200);
        for (int elem : k) {
            System.out.println(elem);
        }
    }
}
