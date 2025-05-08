class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       boolean temp=true;
       List<Boolean> result= new ArrayList<>();
       int max=0;
       for(int i=0;i<candies.length;i++) {
        max=Math.max(max,candies[i]);
       }
        for(int j=0;j<candies.length;j++) {
            if(candies[j]+extraCandies>=max)
            {
                result.add(true);
            }
            else
            result.add(false);
        }
       return result;
    }
}