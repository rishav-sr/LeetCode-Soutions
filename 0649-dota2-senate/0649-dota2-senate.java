class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> rad= new LinkedList<>();
        Queue<Integer> dir= new LinkedList<>();
        int n=senate.length();
        for(int i=0;i<n;i++) {
            if(senate.charAt(i)=='R')
            rad.offer(i);
            else
            dir.offer(i);
        }

        while(!rad.isEmpty() && !dir.isEmpty()) {
            if(rad.peek()<dir.peek())
            rad.offer(n++);
            else
            dir.offer(n++);
            rad.poll();
            dir.poll();
        }
        return rad.isEmpty()?"Dire":"Radiant";
    }
}