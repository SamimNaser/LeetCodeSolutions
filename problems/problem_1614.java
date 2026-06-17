
public class problem_1614 {

    public static int maxDepth(String s) {
        int count = 0;
        int maxNum = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
                if (maxNum < count) {
                    maxNum = count;
                }
            } else if (c == ')') {
                count--;
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        int k = maxDepth("(1+(2*3)+((8)/4))+1)");
        System.out.println(k);
    }
}
