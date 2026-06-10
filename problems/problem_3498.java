public class problem_3498 {
    public static int reverseDegree(String s) {
        char[] ch = s.toCharArray();
        int output = 0;
        for (int i = 0; i < ch.length; i++) {
            output += (i+1)*(26-(ch[i]-'a'));
        }
        return output;
    }
    public static void main(String[] args) {
        int k = reverseDegree("zaza");
        System.err.println(k);
    }
}
