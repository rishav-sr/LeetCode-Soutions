class Solution {
    StringBuilder result=new StringBuilder();
    public String mergeAlternately(String word1, String word2) {
        int i,a=0,b=0;
        int val=Math.min(word1.length(),word2.length());
        for(i=0;i<val;i++)
        {
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
        }
        if(word1.length()>i)
        {
            result.append(word1.substring(i,word1.length()));
        }
        if(word2.length()>i)
        {
            result.append(word2.substring(i,word2.length()));
        }

        // while(word1.length()>a) {
        //     result.append(word1.charAt(a));
        //     a++;s
        // }
        // while(word2.length()>b) {
        //     result.append(word2.charAt(b));
        //     b++;
        // }
        return result.toString();
    }
}