
public class problem_1732 {

    public static int largestAltitude(int[] gain) {
        int altitude = 0;
        int max = 0;

        for (int g : gain) {
            altitude += g;
            max = Math.max(max, altitude);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        int k = largestAltitude(gain);
        System.out.println(k);
    }
}
