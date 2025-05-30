class Solution {
    //at that postion left, right will contain all product except that position's, so just multiplying them you get resultant array
    //optimized:used res array only instead of using two more. first populate res with left products, and then calculate right product on the fly and multiply with res
    public int[] productExceptSelf(int[] nums) {
        int res[]= new int[nums.length];
        res[0]=1;
        for(int i=1;i<res.length;i++) {
            res[i]=res[i-1]*nums[i-1];
        }
        int right=1;
        for(int i=nums.length-1;i>=0;i--) {
            res[i]=res[i]*right;
            right*=nums[i];
        }
        return res;
    }
}