class Solution {
    int dp[];
    public int climbStairs(int n) {
        dp= new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,1);
    }

    public int solve(int n,int i) {
        if(i>=n)
        return 1;
        if(dp[i]!=-1)
        return dp[i];
        return dp[i]= solve(n,i+1)+solve(n,i+2);
    }
}