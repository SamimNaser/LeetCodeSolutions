public class problem_1108 {
    public static String defangIPaddr(String address) {
        return address.replace("." , "[.]");
    }
    public static void main(String[] args) {
        String address = "1.1.1.1";
        String k = defangIPaddr(address);
        System.err.println(k);
    }
}
