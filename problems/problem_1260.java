
import java.util.Arrays;
import java.util.List;

public class problem_1260 {

    public static int[][] oneShift(int[][] grid, int m, int n) {
        int newVal = grid[m - 1][n - 1];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int temp = grid[i][j];
                grid[i][j] = newVal;
                newVal = temp;
            }
        }

        return grid;
    }

    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        while (k > 0) {
            k--;
            grid = oneShift(grid, grid.length, grid[0].length);
        }
        return (List) Arrays.asList(grid);
    }
}
