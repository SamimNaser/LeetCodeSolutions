
public class problem_2373 {

    public static int largestLocalUtil(int[][] grid, int x, int y) {
        int max = 0;

        for (int i = x; i < x + 3; i++) {
            for (int j = y; j < y + 3; j++) {
                max = Math.max(max, grid[i][j]);
            }
        }
        return max;
    }

    public static int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int m = n - 2;
        int[][] ans = new int[m][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                ans[i][j] = largestLocalUtil(grid, i, j);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] nums = {{9, 9, 8, 1}, {5, 6, 2, 6}, {8, 2, 6, 4}, {6, 2, 2, 2}};
        int[][] k = largestLocal(nums);
        for (int i = 0; i < k.length; i++) {
            for (int j = 0; j < k.length; j++) {
                System.out.println(k[i][j]);
            }
        }
    }
}
