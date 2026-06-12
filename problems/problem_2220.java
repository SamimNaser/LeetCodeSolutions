
public class problem_2220 {

    public static int minBitFlips(int start, int goal) {
        return Integer.bitCount(start ^ goal);
    }

    public static void main(String[] args) {
        int k = minBitFlips(3, 7);
        System.out.println(k);
    }
}
