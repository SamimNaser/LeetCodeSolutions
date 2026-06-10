public class problem_3794 {
    public static String reversePrefix(String s, int k) {
        char[] c = s.toCharArray();
        char[] output = new char[s.length()];
        int l = 0;
        for (int i = k-1; i>=0 ; i--) {
            output[l] += c[i];
            l++;
        }
        for(int i = k;i< c.length;i++){
            output[l] += c[i];
            l++;
        }
        String outputs = new String(output);
        return outputs;
    }
    public static void main(String[] args) {
        String k = reversePrefix("hey", 1);
        System.err.println(k);
    }
}
