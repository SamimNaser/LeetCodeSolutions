
import java.util.ArrayList;
import java.util.List;

public class problem_2194 {

    public static List<String> cellsInRange(String s) {
        char c1 = s.charAt(0), c2 = s.charAt(3);
        char r1 = s.charAt(1), r2 = s.charAt(4);
        List<String> output = new ArrayList<>();

        for (char c = c1; c <= c2; c++) {
            for (char r = r1; r <= r2; r++) {
                System.out.println("c :" + c);
                System.out.println("r :" + r);
                output.add("" + c + r);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        String s = "A1:F1";
        List<String> k = cellsInRange(s);
        for (String elem : k) {
            System.out.println(elem);
        }
    }
}
