class Solution {
    public int numSquares(int n) {
       int dp[]= new int[n+1];
       Arrays.fill(dp,-1);
       return solve(n,dp);
    }

    public int solve(int n,int[] dp) {
        if(n<=3)
        return n;
        if(dp[n]!=-1)
        return dp[n];
        int ans=n;
        for(int i=1;i*i<=n;i++) {
            ans=Math.min(ans,1+solve(n-i*i,dp));
        }
        return dp[n]=ans;

        
    }
}