
public class problem_1323 {

    public static int maximum69Number(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == '6') {
                digits[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(digits));
    }

    public static void main(String[] args) {
        int k = maximum69Number(9669);
    }
}
