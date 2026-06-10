public class problem_2011 {
    public static int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for (String elem : operations) {
            if(elem.charAt(1)=='+'){
                X++;
            }
            else{
                X--;
            }
        }
        return X;
    }
    public static void main(String[] args) {
        String[] t = {"++X","++X","X++"};
        int k = finalValueAfterOperations(t);
        System.err.println(k);
    }
}
