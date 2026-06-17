
import java.util.Arrays;
import java.util.List;

public class problem_1773 {

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        String[] rules = new String[]{"type", "color", "name"};
        int rule = 0;

        for (int i = 0; i < rules.length; i++) {
            if (ruleKey.contains(rules[i])) {
                rule = i;
            }
        }
        int count = 0;

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(rule).equals(ruleValue)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        List<List<String>> items = Arrays.asList(
                Arrays.asList("phone", "blue", "pixel"),
                Arrays.asList("computer", "silver", "lenovo"),
                Arrays.asList("phone", "gold", "iphone")
        );
        String ruleKey = "color";
        String ruleValue = "silver";
        int k = countMatches(items, ruleKey, ruleValue);
        System.out.println(k);
    }
}
