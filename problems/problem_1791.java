
public class problem_1791 {

    public static int findCenter(int[][] edges) {
        int n = edges.length;
        int m = edges[0].length;
        int ans = -1;
        for (int i = 0; i < m; i++) {

            // Traverse the first row
            int check = edges[0][i];
            int count = 1;

            for (int j = 1; j < n; j++) {

                for (int k = 0; k < m; k++) {

                    // break out of the loop
                    // if element is found
                    if (edges[j][k] == check) {
                        count++;
                        break;
                    }
                }
            }

            if (count == n) {
                ans = edges[0][i];
                break;
            }
        }
        return ans;

        // return edges[0][0]==edges[1][0] || edges[0][0]==edges[1][1]?edges[0][0]:edges[0][1]; alternate method 
    }

    public static void main(String[] args) {
        int[][] edges = {{1, 2}, {2, 3}, {4, 2}};
        int k = findCenter(edges);
        System.out.println(k);
    }
}
