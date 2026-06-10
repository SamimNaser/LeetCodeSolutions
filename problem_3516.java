
public class problem_3516 {

    public static int findClosest(int x, int y, int z) {
        int person2 = Math.abs(z - x);
        int person1 = Math.abs(z - y);

        if (person1 > person2) {
            return 1;
        } else if (person2 > person1) {
            return 2;
        }
        return 0;
    }

    public static void main(String[] args) {
        int k = findClosest(2, 5, 6);
        System.err.println(k);
    }
}
