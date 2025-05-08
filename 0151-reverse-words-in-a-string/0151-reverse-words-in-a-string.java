class Solution {
    public String reverseWords(String s) {
        s=s+" ";
        StringBuilder result= new StringBuilder();
        StringBuilder word= new StringBuilder();
        for(int i=0;i<s.length();i++) {
            if(Character.isLetterOrDigit(s.charAt(i)))
            word.append(s.charAt(i));
            else
            {
                System.out.println(word);
                if(word.isEmpty())
                {
                    continue;
                }
                else {
                    
                    word.append(" ");
                    result.insert(0,word);
                    word= new StringBuilder();
                }
            }
        }
        return result.toString().trim();
    }
}