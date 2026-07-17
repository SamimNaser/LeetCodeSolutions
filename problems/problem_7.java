
public class problem_7 {

    public static int reverse(int x) {
        int res = 0;
        boolean isNegative = x < 0;
        String strX = String.valueOf(Math.abs(x));
        StringBuilder sb = new StringBuilder(strX).reverse();

        try {
            res = Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return 0;
        }

        return isNegative ? -res : res;
    }

    public static int reverse2(int x) {
        int rev = 0;
        while (x != 0) {
            int digit = x % 10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
            rev = (rev * 10) + digit;
            x = x / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int k = reverse(-321);
        System.out.println(k);
    }
}
