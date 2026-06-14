
public class problem_1816 {

    public static String truncateSentence(String s, int k) {
        int spaces = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                spaces++;
                if (spaces == k) {
                    return s.substring(0, i);
                }
            }
        }
        return s;
    }

    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        String l = truncateSentence(s, k);
        System.out.println(l);
    }
}
