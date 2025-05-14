class Solution {
    // public String removeStars(String s) {
    //     Stack<Character> stack= new Stack<>();
    //     StringBuilder sb= new StringBuilder();
    //     for(char ch:s.toCharArray()) {
    //         if(ch=='*') {
    //             stack.pop();
    //         }
    //         else {
    //             stack.push(ch);
    //         }
    //     }
    //     if(stack.isEmpty())
    //     return "";
    //     else
    //     {
    //         while(!stack.isEmpty()) {
    //             sb.append(stack.pop());
    //         }
    //     }
    //     return sb.reverse().toString();
    // }

    public String removeStars(String s) {
        StringBuilder sb= new StringBuilder();
        for(char ch:s.toCharArray()) {
            if(ch=='*')
            sb.deleteCharAt(sb.length()-1);
            else
            sb.append(ch);
        }
        return sb.toString();
    }
}