
public class problem_3751 {

    public static int totalWaviness(int num1, int num2) {
        int count = 0;

        for (int i = num1; i <= num2; i++) {
            String s = String.valueOf(i);

            if (s.length() < 3) {
                continue;
            }
            for (int j = 1; j < s.length() - 1; j++) {
                char prev = s.charAt(j - 1);
                char curr = s.charAt(j);
                char next = s.charAt(j + 1);

                if ((curr > prev && curr > next)
                        || (curr < prev && curr < next)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int k = totalWaviness(120, 130);
        System.out.println(k);
    }
}
