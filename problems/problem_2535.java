
public class problem_2535 {

    public static int differenceOfSum(int[] nums) {
        // int sumT = 0;
        // int sumD = 0;
        // for (int elem : nums) {
        //     sumT += elem;
        //     int elemC = elem;
        //     while (elemC > 0) {
        //         sumD += elemC % 10;
        //         elemC = elemC / 10;
        //     }
        // }
        // return Math.abs(sumT - sumD);

        int ans = 0;
        for (int i : nums) {
            while ((i /= 10) > 0) {
                ans += 9 * i;
                System.out.println(ans);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 15, 6, 3};
        int k = differenceOfSum(nums);
        System.out.println(k);
    }
}
