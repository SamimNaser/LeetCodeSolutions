
import java.util.ArrayList;
import java.util.List;

public class problem_1431 {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> output = new ArrayList<>();
        int c = 0;
        for (int elem : candies) {
            c = Math.max(c, elem);
        }
        for (int elem : candies) {
            if (elem + extraCandies >= c) {
                output.add(true);
            } else {
                output.add(false);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        List<Boolean> k = new ArrayList<>();
        k = kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3);
        System.out.println(k);
    }
}
