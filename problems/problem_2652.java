
public class problem_2652 {

    public static int sumOfMultiples(int n) {
        int output = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                output += i;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int k = sumOfMultiples(7);
        System.out.println(k);
    }
}
