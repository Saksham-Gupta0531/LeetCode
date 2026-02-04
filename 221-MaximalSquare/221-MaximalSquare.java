// Last updated: 2/4/2026, 12:32:44 PM
class Solution {
    public int maximalSquare(char[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];
        int ans = 0;
        for (int i = 0; i < matrix.length; i++) {
            dp[i][0] = matrix[i][0]-'0';
            if (dp[i][0]==1)ans =1;
        }
        for (int i = 0; i < matrix[0].length; i++) {
            dp[0][i] = matrix[0][i]-'0';
             if (dp[0][i]==1)ans =1;
        }
        
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == '0')
                    dp[i][j] = 0;
                else {

                    int a = dp[i - 1][j - 1];
                    int b = dp[i - 1][j];
                    int c = dp[i][j - 1];
                    dp[i][j] = Math.min(a, Math.min(b, c)) + 1;
                    ans = Math.max(ans, dp[i][j]);
                }
            }
        }
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[0].length; j++) {
        //         System.out.print(dp[i][j]);
        //     }
        //     System.out.println();
        // }
        return ans*ans;
    }
}