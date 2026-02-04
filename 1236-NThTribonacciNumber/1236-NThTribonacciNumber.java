// Last updated: 2/4/2026, 12:30:06 PM
class Solution {
    public int tribonacci(int n) {
        return tribo(n+1, new Integer[n+2]);
    }
    public int tribo(int n,Integer[] dp){
        if( n==0) return 0;
        else if(n==1) {return 0; }
        else if(n==2) {return 1; }
        else if(n==3) {return 1; }
        if (dp[n] != null) return dp[n];
        dp[n]=(int) (tribo(n-1,dp)+tribo(n-2,dp)+tribo(n-3,dp));
        return dp[n];

    }

}