class Solution {
    // int dp[];
    // public int climbStairs(int n) {
    //     dp= new int[n+1];
    //     Arrays.fill(dp,-1);
    //     return solve(n,1);
    // }

    // public int solve(int n,int i) {
    //     if(i>=n)
    //     return 1;
    //     if(dp[i]!=-1)
    //     return dp[i];
    //     return dp[i]= solve(n,i+1)+solve(n,i+2);
    // }

    public int climbStairs(int n) {
        if(n==1)
        return 1;
        int oneStep=1;
        int twoStep=1;
        int step=0;
        for(int i=2;i<=n;i++) {
            step=oneStep+twoStep;
            oneStep=twoStep;
            twoStep=step;
        }
        return step;
    }
}