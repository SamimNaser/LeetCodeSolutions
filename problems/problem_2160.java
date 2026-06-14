
import java.util.Arrays;

public class problem_2160 {

    public static int minimumSum(int num) {
        int arr[] = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = num % 10;
            num = num / 10;
        }
        Arrays.sort(arr);

        return ((arr[0] * 10 + arr[2]) + (arr[1] * 10 + arr[3]));
    }

    public static void main(String[] args) {
        int k = minimumSum(2932);
        System.out.println(k);
    }
}
