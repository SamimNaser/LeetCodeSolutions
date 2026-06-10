import java.util.ArrayList;
import java.util.List;

public class problem_2942 {
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> output = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if(words[i].indexOf(x) >= 0){
                output.add(i);
            }
        }
        return output;
    }
    public static void main(String[] args) {
        List<Integer> k = new ArrayList<>();
        String[] words = {"abc","bcd","aaaa","cbc"};
        k = findWordsContaining(words, 'a');
        System.err.println(k);
    }
}
