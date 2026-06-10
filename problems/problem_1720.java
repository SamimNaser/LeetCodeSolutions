
public class problem_1720 {

    public static int[] decode(int[] encoded, int first) {
        int[] output = new int[encoded.length + 1];
        output[0] = first;
        int a = first;
        int b;
        for (int i = 0; i < encoded.length; i++) {
            int c = encoded[i];
            b = c ^ a;
            output[i + 1] = b;
            a = b;
        }
        return output;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k[] = decode(nums, 1);
        for (int elem : k) {
            System.out.println(elem);
        }
    }
}
