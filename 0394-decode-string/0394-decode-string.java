class Solution {
    public String decodeString(String s) {
        Stack<Integer> sti= new Stack<Integer>();
        Stack<StringBuilder> stb=new Stack<StringBuilder>();
        StringBuilder sb= new StringBuilder();int n=0;
        for(char ch:s.toCharArray()) {
            if(Character.isDigit(ch)) {
                n=n*10+(ch-'0');
            }
            else if(ch=='[') {
                sti.push(n);
                n=0;
                stb.push(sb);
                sb= new StringBuilder();
            }
            else if (ch==']') {
                int k=sti.pop();
                StringBuilder temp=sb;
                sb=stb.pop();
                while(k>0) {
                    sb.append(temp);
                    k--;
                }
            }
            else
            sb.append(ch);
        }
        return sb.toString();
}
    }

