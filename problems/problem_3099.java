
public class problem_3099 {

    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        int numc = x;
        while (numc > 0) {
            sum += numc % 10;
            numc /= 10;
        }
        if (x % sum == 0) {
            return sum;
        }
        return -1;
    }
}
