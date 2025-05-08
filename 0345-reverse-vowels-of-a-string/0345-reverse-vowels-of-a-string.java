class Solution {
    public String reverseVowels(String s) {
        StringBuilder st= new StringBuilder();
        StringBuilder result= new StringBuilder();
        for(int i=0;i<s.length();i++) {
            if(Character.toLowerCase(s.charAt(i))=='a' || Character.toLowerCase(s.charAt(i))=='e' || Character.toLowerCase(s.charAt(i))=='i' || Character.toLowerCase(s.charAt(i))=='o' || Character.toLowerCase(s.charAt(i))=='u' ) {
                st.append(s.charAt(i));
            }
        }
        st=st.reverse();int a=0;
        for(int i=0;i<s.length();i++) {
            if(Character.toLowerCase(s.charAt(i))=='a' || Character.toLowerCase(s.charAt(i))=='e' || Character.toLowerCase(s.charAt(i))=='i' || Character.toLowerCase(s.charAt(i))=='o' || Character.toLowerCase(s.charAt(i))=='u' ) {
                result.append(st.charAt(a));
                a++;
        }
        else
        result.append(s.charAt(i));
    }
    return result.toString();
}
}