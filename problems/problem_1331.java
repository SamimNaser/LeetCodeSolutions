
import java.util.Arrays;
import java.util.HashMap;

public class problem_1331 {

    public static int[] arrayRankTransform(int[] arr) {
        int temp[] = arr.clone();
        Arrays.sort(temp);
        HashMap<Integer, Integer> table = new HashMap<Integer, Integer>();
        int rank = 1;

        for (int elem : temp) {
            if (!table.containsKey(elem)) {
                table.put(elem, rank);
                rank++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = table.get(arr[i]);
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {40, 10, 20, 30};
        int[] k = arrayRankTransform(arr);
        for (int elem : k) {
            System.out.println(elem);
        }
    }
}
