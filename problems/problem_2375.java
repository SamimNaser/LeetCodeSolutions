
public class problem_2375 {

    public static String smallestNumber(String s) {
        StringBuilder output = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i <= s.length(); i++) {
            temp.append((char) ('1' + i));
            if (i == s.length() || s.charAt(i) == 'I') {
                output.append(temp.reverse());
                temp = new StringBuilder();
            }
        }
        return output.toString();
    }

    public static void main(String[] args) {
        String k = smallestNumber("IIIDIDDD");
        System.out.println(k);
    }
}
