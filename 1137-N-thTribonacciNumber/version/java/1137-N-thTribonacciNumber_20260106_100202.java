// Last updated: 1/6/2026, 10:02:02 AM
1class Solution {
2    public int tribonacci(int n) {
3        return tribo(n+1, new Integer[n+2]);
4    }
5    public int tribo(int n,Integer[] dp){
6        if( n==0) return 0;
7        else if(n==1) {return 0; }
8        else if(n==2) {return 1; }
9        else if(n==3) {return 1; }
10        if (dp[n] != null) return dp[n];
11        dp[n]=(int) (tribo(n-1,dp)+tribo(n-2,dp)+tribo(n-3,dp));
12        return dp[n];
13
14    }
15
16}