// Last updated: 2/4/2026, 12:30:21 PM
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int ans =Integer.MAX_VALUE ;
        int[][] dp = new int[matrix.length][matrix[0].length];
        for (int i = 0 ; i<matrix.length ;i++){
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }
        for (int i = 0 ; i < matrix[0].length ; i++)
            ans =Math.min(ans ,fallingpath(matrix , 0 , i ,dp));
        return ans;
    }
    public int fallingpath(int[][] mat , int i, int j, int[][] dp){
        if (j <0 || j>= mat.length) return Integer.MAX_VALUE;
        if (i==mat.length-1) return mat[i][j];
        if ( dp[i][j]!=Integer.MAX_VALUE) return dp[i][j];
        int a=fallingpath(mat ,i+1,j,dp);
        int b=fallingpath(mat, i+1,j+1,dp);
        int c=fallingpath(mat,i+1,j-1,dp);
        dp[i][j]= Math.min(c,Math.min(a,b))+mat[i][j];
        return dp[i][j];
    }
}