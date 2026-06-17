
public class problem_2418 {

    public static String[] bubbleSort(String[] names, int[] heights, int n) {
        int i, j, temp;
        String temp2;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (heights[j] < heights[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    temp = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = temp;

                    temp2 = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp2;
                    swapped = true;

                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false) {
                break;
            }
        }
        return names;
    }

    public static void main(String[] args) {
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};
        String[] k = bubbleSort(names, heights, heights.length);
        for (String elem : k) {
            System.out.println(elem);
        }
    }
}
