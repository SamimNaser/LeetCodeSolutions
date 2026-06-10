public class problem_2672 {
    public static int maximumWealth(int[][] accounts) {
        int maxSum = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                sum += account[j];
            }
            if(maxSum < sum){
                maxSum = sum;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[][] accounts = {{1,5},{7,3},{3,5}};
        int k = maximumWealth(accounts);
        System.err.println(k);
    }
}
