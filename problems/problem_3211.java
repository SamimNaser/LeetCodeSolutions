
import java.util.ArrayList;
import java.util.List;

public class problem_3211 {

    public static void createString(List<String> result, StringBuilder s, int n, int last) {
        if (s.length() == n) {
            result.add(s.toString());
            return;
        }

        s.append("1");
        createString(result, s, n, 1);
        s.deleteCharAt(s.length() - 1);

        if (last != 0) {
            s.append('0');
            createString(result, s, n, 0);
            s.deleteCharAt(s.length() - 1);
        }
    }

    public static List<String> validStrings(int n) {
        List<String> output = new ArrayList<String>();
        StringBuilder str = new StringBuilder(n);
        createString(output, str, n, -1);
        return output;
    }

    public static void main(String[] args) {
        List<String> k = validStrings(3);
        for (String elem : k) {
            System.out.println(elem);
        }
    }
}
