public class problem_2469 {
    public static double[] convertTemperature(double celsius) {
        double[] temp = new double[2];
        temp[0] = (celsius + 273.15);
        temp[1] = (celsius * 1.80 + 32.00);
        return temp;
    }
    public static void main(String[] args) {
        double[] k = convertTemperature(36.50);
        for (double elem : k) {
            System.err.println(elem);
        }
    }
}
