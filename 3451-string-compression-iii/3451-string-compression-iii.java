class Solution {
    public String compressedString(String word) {
        int i=0,start=0; StringBuilder result= new StringBuilder();
        while(i<word.length()){
            int groupLength=1;
            while(i+groupLength<word.length() && word.charAt(i+groupLength)==word.charAt(i))
            groupLength++;
            int temp=groupLength;
            while(groupLength>0) {
                if(groupLength>9) {
                    result.append(9);
                    groupLength-=9;
                }
                else{
                    result.append(groupLength);
                    groupLength=0;
                }
                result.append(word.charAt(i));
            }
            i+=temp;
        }
        return result.toString();
    }
}