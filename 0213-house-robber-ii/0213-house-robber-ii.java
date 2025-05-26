class Solution {
    
    public int rob(int[] nums) {
        if(nums.length==1)
        return nums[0];
        if(nums.length==2)
        return Math.max(nums[0],nums[1]);
        if(nums.length==3)
        return Math.max(nums[2],Math.max(nums[0],nums[1]));
        int arr1[]= Arrays.copyOfRange(nums, 0, nums.length-1);
        int arr2[]= Arrays.copyOfRange(nums, 1, nums.length);
        int dp1[]= new int[arr1.length];
        int dp2[]= new int[arr2.length];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        return Math.max(solve(arr1,0,dp1),solve(arr2,0,dp2));
    }

    public int solve(int[] nums, int i,int[] dp) {
        if(i>=nums.length)
        return 0;
        if(dp[i]!=-1)
        return dp[i];
        return dp[i]= Math.max(nums[i]+solve(nums,i+2,dp),solve(nums,i+1,dp));
    }
}