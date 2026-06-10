
public class problem_2798 {

    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int elem : hours) {
            if (elem >= target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] hours = {5, 1, 4, 2, 2};
        int target = 6;
        int k = numberOfEmployeesWhoMetTarget(hours, target);
        System.out.println(k);
    }
}
