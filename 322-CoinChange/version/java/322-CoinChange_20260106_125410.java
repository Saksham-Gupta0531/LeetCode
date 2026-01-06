// Last updated: 1/6/2026, 12:54:10 PM
1class Solution {
2    public int coinChange(int[] coins, int amount) {
3        int ans= charge(coins  , amount ,0,new Integer[coins.length+1][amount+1]);
4        return ans==(1e9)?-1:ans;
5        
6    }
7    public int charge(int[] coin ,int amt,int i, Integer[][] dp){
8        
9        if ( i== coin.length ) return (int)1e9 ;
10        if (amt==0) return 0;
11        if (dp[i][amt]!=null) return dp[i][amt];
12        int tk =(int)1e9;
13        if (amt>=coin[i])
14            tk =1+charge(coin ,amt -coin[i],i,dp);
15        int nt =charge(coin ,amt,i+1,dp);
16        return dp[i][amt]= Math.min(tk,nt);
17    }
18}