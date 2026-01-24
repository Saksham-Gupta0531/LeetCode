// Last updated: 1/24/2026, 9:55:58 PM
1class Solution {
2    public int minimizeTheDifference(int[][] mat, int t) {
3        int m= mat.length;
4        int[][] dp= new int[m][5001];
5        for(int i=0; i<m; i++){
6            for(int j=0; j<5001; j++){
7                dp[i][j]=-1;
8            }
9        }
10        return solve(mat,dp,0,t,0);
11    }
12    
13    public int solve(int[][] mat, int[][] dp, int ind, int t, int val){
14        if(ind==mat.length){
15            return Math.abs(t-val);
16        }
17        
18        if(dp[ind][val]!=-1){
19            return dp[ind][val];
20        }
21        
22        int min= (int)(1e9);
23        for(int i=0; i<mat[0].length; i++){
24            min= Math.min(min, solve(mat,dp,ind+1,t,val+mat[ind][i]));
25        }
26        
27        return dp[ind][val]= min;
28    }
29}