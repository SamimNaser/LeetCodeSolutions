public class problem_3280 {

    private static String toBinary(int n) {
        long binary = 0;
        int count = 0;

        while (n > 0) {
            int rem = n % 2;
            binary += rem * (long) Math.pow(10, count);
            count++;
            n /= 2;
        }

        return String.valueOf(binary);
    }

    public static String convertDateToBinary(String date) {
        //String[] arr = date.split("-");
        String y = toBinary(Integer.parseInt(date.substring(0, 4)));
        String m = toBinary(Integer.parseInt(date.substring(5,7)));
        String d = toBinary(Integer.parseInt(date.substring(8)));

        StringBuilder stringBuilder = new StringBuilder(y.length()+m.length()+d.length()+2);

        stringBuilder.append(y);
        stringBuilder.append("-");
        stringBuilder.append(m);
        stringBuilder.append("-");
        stringBuilder.append(d);

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s = convertDateToBinary("2080-02-29");
        System.out.println(s);
    }
}