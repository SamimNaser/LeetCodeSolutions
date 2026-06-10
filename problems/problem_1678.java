public class problem_1678 {
    public static String interpret(String command) {
        StringBuilder s = new StringBuilder(command.length());
        for (int i = 0; i < command.length(); i++) {
            if(command.charAt(i) == 'G'){
                s.append('G');
            }
            else{
                if(command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                    s.append('o');
                    i++;
                }
                else{
                    s.append("al");
                    i = i+3;
                }
            }
        }
        return s.toString();
    }
    public static void main(String[] args) {
        String k = interpret("G()()()()(al)");
        System.out.println(k);
    }
}
