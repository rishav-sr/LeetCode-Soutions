class Solution {
    public int largestAltitude(int[] gain) {
        int g=0,max=0;
        for(int i:gain) {
            g=g+i;
            max=Math.max(max,g);
        }
        return max;
        
    }
}