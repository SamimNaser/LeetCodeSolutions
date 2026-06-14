
public class problem_2520 {

    public static int countDigits(int num) {
        int numC = num;
        int count = 0;
        while (num > 0) {
            int d = num % 10;
            if (numC % d == 0) {
                count++;
            }
            num = num / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int k = countDigits(1248);
        System.out.println(k);
    }
}
