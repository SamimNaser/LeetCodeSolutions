
public class problem_3348 {

    public String smallestNumber(String num, long t) {
        int[] primeCount = new int[8];

        while (t % 2 == 0) {
            primeCount[2]++;
            t /= 2;
        }

        while (t % 3 == 0) {
            primeCount[3]++;
            t /= 3;
        }

        while (t % 5 == 0) {
            primeCount[5]++;
            t /= 5;
        }

        while (t % 7 == 0) {
            primeCount[7]++;
            t /= 7;
        }

        return "";
    }
}
