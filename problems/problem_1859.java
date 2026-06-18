
public class problem_1859 {

    public static String sortSentence(String s) {
        String[] words = s.split(" ");
        String output[] = new String[words.length];
        for (String word : words) {
            int pos = word.charAt(word.length() - 1) - '1';
            output[pos] = word.substring(0, word.length() - 1);
        }
        return String.join(" ", output);
    }

    public static void main(String[] args) {
        String s = sortSentence("is2 sentence4 This1 a3");
        System.out.println(s);
    }
}
