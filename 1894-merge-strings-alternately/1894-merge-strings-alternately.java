class Solution {
    StringBuilder result=new StringBuilder();
    public String mergeAlternately(String word1, String word2) {
        int i,a=0,b=0;
        for(i=0;i<(Math.max(word1.length(),word2.length())*2);i++)
        {
            if(word1.length()>a && i%2==0)
            {
                result.append(word1.charAt(a));
                a++;
            }
            if(word2.length()>b && i%2==1)
            {
                result.append(word2.charAt(b));
                b++;
            }
            System.out.println(result);
        }

        // while(word1.length()>a) {
        //     result.append(word1.charAt(a));
        //     a++;
        // }
        // while(word2.length()>b) {
        //     result.append(word2.charAt(b));
        //     b++;
        // }
        return result.toString();
    }
}