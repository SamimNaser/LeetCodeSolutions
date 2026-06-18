
public class problem_3683 {

    public static int earliestTime(int[][] tasks) {
        int output = Integer.MAX_VALUE;
        int sum;
        for (int[] task : tasks) {
            sum = 0;
            for (int j = 0; j < 2; j++) {
                sum += task[j];
            }
            if (sum < output) {
                output = sum;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int[][] tasks = {{100, 100}, {100, 100}, {100, 100}};
        int k = earliestTime(tasks);
        System.out.println(k);
    }
}
