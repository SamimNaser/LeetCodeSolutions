
public class problem_2433 {

    public static int[] findArray(int[] pref) {
        int[] output = new int[pref.length];
        output[0] = pref[0];
        for (int i = 1; i < pref.length; i++) {
            output[i] = pref[i] ^ pref[i - 1];
        }
        return output;
    }

    public static void main(String[] args) {
        int[] pref = {5, 2, 0, 3, 1};
        int[] k = findArray(pref);
        for (int elem : k) {
            System.out.println(elem);
        }
    }
}
