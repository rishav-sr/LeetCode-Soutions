class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0,end=0,ans=0;
        Map<Character,Integer> map= new HashMap<>();
        while(end<s.length())
        {
            map.put(s.charAt(end),map.getOrDefault(s.charAt(end),0)+1);
            while(map.getOrDefault(s.charAt(end),0)>1)
            {
                map.put(s.charAt(start),map.get(s.charAt(start))-1);
                start++;
            }
            ans=Math.max(ans,end-start+1);
            end++;
        }
        return ans;
    }
}
