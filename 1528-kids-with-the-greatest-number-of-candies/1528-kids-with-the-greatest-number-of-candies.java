class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       boolean temp=true;
       List<Boolean> result= new ArrayList<>();
       for(int i=0;i<candies.length;i++) {
        for(int j=0;j<candies.length;j++) {
            if(candies[i]+extraCandies<candies[j])
            {
                temp=false;
                break;
            }
        }
        result.add(temp);
        temp=true;
       }
       return result;
    }
}