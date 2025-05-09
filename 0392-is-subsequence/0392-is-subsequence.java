class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)
        return true;
        if(t.length()==0 || s.length()>t.length())
        return false;
        String min= s.length()>t.length()?t:s;
        String max= s.length()>t.length()?s:t;
        int counter=0;
        for(int i=0;i<max.length();i++) {
            if(min.charAt(counter)==max.charAt(i)) {
                counter++;
            }
            if(counter==min.length()) {
                return true;
            }
        }
        return false;

    }
}