public class problem_3945 {
    public static int digitFrequencyScore(int n) {
        int output = 0;
        while (n > 0){ 
            int c = 0;
            int d = n%10; 
            if (n % 10 == d)
                c++;
            n = n / 10;
            output += d*c ;
        }
        return output;
    }
    public static void main(String[] args) {
        int n = digitFrequencyScore(101);
        System.out.println(n);
    }
}