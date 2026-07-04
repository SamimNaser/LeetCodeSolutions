
class problem_14 {

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        String prex;
        String output = "";

        for (int i = 0; i < strs[0].length(); i++) {

            prex = strs[0].substring(0, i + 1);
            int count = 0;
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].startsWith(prex)) {
                    count++;
                }
            }
            if (count == strs.length - 1) {
                output = prex;
            } else {
                break;

            }
        }
        return output;
    }

    public static void main(String[] args) {
        String[] strs = {"dog", "racecar", "car"};
        String output = longestCommonPrefix(strs);
        System.out.println(output);

    }
}
