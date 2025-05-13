class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map= new HashMap<>();
        //value,occur;
        Set<Integer> set= new HashSet<>();
        for(int i:arr) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
            if(set.contains(entry.getValue()))
            return false;
            set.add(entry.getValue());
        }
        return true;
    }
}