public class problem_771 {
    public static int numJewelsInStones(String jewels, String stones) {
        char[] jewel = jewels.toCharArray();
        char[] stone = stones.toCharArray();
        int output = 0;

        for (char elem : jewel) {
            for (char elem2 : stone) {
                if(elem == elem2) {
                    output++;
                }
            }
        }
        return output;
    }
    public static void main(String[] args) {
        int k = numJewelsInStones("aA", "aAAbbbb");
        System.err.println(k);
    }
}
