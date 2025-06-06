class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount==0)
        return 0;
        int dp[]= new int[amount+1];
        for(int i=1;i<amount+1;i++) {
            dp[i]=amount+1;
            for(int coin:coins) {
                if(coin<=i) {
                    dp[i]=Math.min(dp[i],dp[i-coin]+1);
                }
            }
        }
        return dp[amount]==amount+1?-1:dp[amount];
    }
}