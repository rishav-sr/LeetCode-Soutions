class Solution {
    public int equalPairs(int[][] grid) {
        Map<String,Integer> map= new HashMap<>();
        StringBuilder st;int count=0;
        for(int i=0;i<grid.length;i++) {
            st= new StringBuilder();
            for(int j=0;j<grid.length;j++) {
                st.append(grid[i][j]+",");
            }
            System.out.println(st);
            map.put(st.toString(),map.getOrDefault(st.toString(),0)+1);
        }
        for(int i=0;i<grid.length;i++) {
            st= new StringBuilder();
            for(int j=0;j<grid.length;j++) {
                st.append(grid[j][i]+",");
            }
            System.out.println(st);
            if(map.containsKey(st.toString()))
            count+=map.get(st.toString());
        }
        return count;
    }
}