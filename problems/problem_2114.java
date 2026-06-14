
class problem_2114 {

    public static int mostWordsFound(String[] sentences) {
        int maxword = 0;

        for (String sentence : sentences) {
            int word = mostwords(sentence);
            maxword = Math.max(word, maxword);
        }
        return maxword;

    }

    public static int mostwords(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        return count + 1;
    }

    public static void main(String[] args) {
        String[] s = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int k = mostWordsFound(s);
        System.out.println(k);

    }
}
