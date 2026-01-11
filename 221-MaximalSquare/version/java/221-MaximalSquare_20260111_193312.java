// Last updated: 1/11/2026, 7:33:12 PM
1class Solution {
2    public int maximalSquare(char[][] matrix) {
3        int[][] dp = new int[matrix.length][matrix[0].length];
4        int ans = 0;
5        for (int i = 0; i < matrix.length; i++) {
6            dp[i][0] = matrix[i][0]-'0';
7            if (dp[i][0]==1)ans =1;
8        }
9        for (int i = 0; i < matrix[0].length; i++) {
10            dp[0][i] = matrix[0][i]-'0';
11             if (dp[0][i]==1)ans =1;
12        }
13        
14        for (int i = 1; i < matrix.length; i++) {
15            for (int j = 1; j < matrix[0].length; j++) {
16                if (matrix[i][j] == '0')
17                    dp[i][j] = 0;
18                else {
19
20                    int a = dp[i - 1][j - 1];
21                    int b = dp[i - 1][j];
22                    int c = dp[i][j - 1];
23                    dp[i][j] = Math.min(a, Math.min(b, c)) + 1;
24                    ans = Math.max(ans, dp[i][j]);
25                }
26            }
27        }
28        // for (int i = 0; i < matrix.length; i++) {
29        //     for (int j = 0; j < matrix[0].length; j++) {
30        //         System.out.print(dp[i][j]);
31        //     }
32        //     System.out.println();
33        // }
34        return ans*ans;
35    }
36}