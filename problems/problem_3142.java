
public class problem_3142 {

    public static int numberOfSteps(int num) {
        int count = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num = num / 2;
                count++;
            } else {
                num = num - 1;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int k = numberOfSteps(14);
        System.out.println(k);
    }
}
