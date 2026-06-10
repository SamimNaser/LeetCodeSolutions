public class problem_1684 {
    public static int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(String w:words)
        {
            boolean flag=true;
            for(int i=0;i<w.length();i++)
            {
                if(allowed.indexOf(w.charAt(i))==-1) 
                {
                    flag=false;
                    break;
                }
            }
            if(flag==true) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        int k = countConsistentStrings(allowed, words);
        System.err.println(k);
    }
}
