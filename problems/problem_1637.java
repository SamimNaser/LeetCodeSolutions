
import java.util.Arrays;

public class problem_1637 {

    public static int maxWidthOfVerticalArea(int[][] points) {
        int output = 0;
        int[] Xcords = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            Xcords[i] = points[i][0];
        }
        Arrays.sort(Xcords);
        for (int i = 0; i < Xcords.length - 1; i++) {
            output = Math.max(output, Xcords[i + 1] - Xcords[i]);
        }
        return output;
    }

    public static void main(String[] args) {
        int[][] points = {{3, 1}, {9, 0}, {1, 0}, {1, 4}, {5, 3}, {8, 8}};
        int k = maxWidthOfVerticalArea(points);
        System.out.println(k);
    }
}
