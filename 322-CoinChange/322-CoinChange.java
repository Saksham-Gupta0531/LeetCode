// Last updated: 2/4/2026, 12:32:24 PM
class Solution {
    public int coinChange(int[] coins, int amount) {
        int ans= charge(coins  , amount ,0,new Integer[coins.length+1][amount+1]);
        return ans==(1e9)?-1:ans;
        
    }
    public int charge(int[] coin ,int amt,int i, Integer[][] dp){
        
        if ( i== coin.length ) return (int)1e9 ;
        if (amt==0) return 0;
        if (dp[i][amt]!=null) return dp[i][amt];
        int tk =(int)1e9;
        if (amt>=coin[i])
            tk =1+charge(coin ,amt -coin[i],i,dp);
        int nt =charge(coin ,amt,i+1,dp);
        return dp[i][amt]= Math.min(tk,nt);
    }
}