public class problem_2413 {
    public static int smallestEvenMultiple(int n) {
        if(n % 2 != 0){
            return 2*n;
        }
        return n;
    }
    public static void main(String[] args) {
        int k = smallestEvenMultiple(6);
        System.err.println(k);
    }
}
