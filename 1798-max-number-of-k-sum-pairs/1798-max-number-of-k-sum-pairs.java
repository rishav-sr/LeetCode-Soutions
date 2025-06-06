class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer,Integer> map= new HashMap<>();
        int pair=0;
        for(int i:nums) {
            if(map.containsKey(k-i) && map.get(k-i)>0)
            {
                pair++;
                map.put(k-i,map.get(k-i)-1);
            }
            else
            map.put(i,map.getOrDefault(i,0)+1);
        }
        return pair;
    }
}