class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String min=str1.length()>str2.length()?str2:str1;
        String max="";
        StringBuilder st= new StringBuilder();
        for(int i=0;i<min.length();i++) {
            st.append(min.charAt(i));
            if(str1.replace(st.toString(),"").isEmpty() && str2.replace(st.toString(),"").isEmpty())
            max=max.length()<st.length()?st.toString():max;
        }
        return max.length()==0?"":max;
    }
}