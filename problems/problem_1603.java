
public class problem_1603 {

    private final int[] spots;

    public problem_1603(int big, int medium, int small) {
        spots = new int[]{big, medium, small};
    }

    public boolean addCar(int carType) {
        if (spots[carType - 1] > 0) {
            spots[carType - 1]--;
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        problem_1603 obj = new problem_1603(1, 1, 0);
        System.out.println(obj.addCar(1));
        System.out.println(obj.addCar(2));
        System.out.println(obj.addCar(3));
        System.out.println(obj.addCar(1));

    }
}
