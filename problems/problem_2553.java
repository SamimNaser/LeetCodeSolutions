
import java.util.ArrayList;
import java.util.List;

public class problem_2553 {

    public static int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            String s = String.valueOf(num);
            for (char ch : s.toCharArray()) {
                list.add(ch - '0');
            }
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;

        // Alternate - faster 
        // StringBuilder sb=new StringBuilder();
        // for(int x:nums)
        //     sb.append(x);
        // int[] ar=new int[sb.length()];
        // for(int i=0;i<sb.length();i++){
        //     ar[i]=sb.charAt(i)-'0';
        // }
        // return ar;
    }

    public static void main(String[] args) {
        int[] nums = {13, 25, 83, 77};
        int[] k = separateDigits(nums);
        for (int elem : k) {
            System.out.println(elem);
        }
    }
}
