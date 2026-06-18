
public class problem_1572 {

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            sum += mat[i][i];

            if (i != n - i - 1) {
                sum += mat[i][n - i - 1];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int k = diagonalSum(mat);
        System.out.println(k);
    }
}
