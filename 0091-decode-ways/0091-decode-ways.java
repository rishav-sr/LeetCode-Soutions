class Solution {
    int dp[];
    public int numDecodings(String s) {
        dp= new int[s.length()];
        Arrays.fill(dp,-1);
        return solve(s,0);
    }

    public int solve(String s, int count) {
        if(count==s.length()) 
        return 1;
        if(s.charAt(count)=='0')
        return 0;
        if(dp[count]!=-1)
        return dp[count];
        int ans = solve(s,count+1);
        if(count+1<s.length() && Integer.parseInt(s.substring(count,count+2))<=26)
        ans+=solve(s,count+2);
        dp[count]=ans;
        return dp[count];
    }
}