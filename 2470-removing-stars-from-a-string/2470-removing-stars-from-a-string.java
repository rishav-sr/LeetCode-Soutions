class Solution {
    public String removeStars(String s) {
        Stack<Character> stack= new Stack<>();
        StringBuilder sb= new StringBuilder();
        for(char ch:s.toCharArray()) {
            if(ch=='*') {
                stack.pop();
            }
            else {
                stack.push(ch);
            }
        }
        if(stack.isEmpty())
        return "";
        else
        {
            while(!stack.isEmpty()) {
                sb.append(stack.pop());
            }
        }
        return sb.reverse().toString();
    }
}