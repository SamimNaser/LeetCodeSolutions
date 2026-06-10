public class problem_3783 {
    public static int mirrorDistance(int n) {
        int original = n;
        int rev = 0;
        while(n != 0){
            int d = n%10;
            rev = rev*10+d;
            n = n/10;
        }
        return Math.abs(original-rev);
    }
    public static void main(String[] args) {
        int k = mirrorDistance(121);
        System.err.println(k);
    }
}
