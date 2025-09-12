// Last updated: 9/12/2025, 11:52:18 PM
class Solution {
    public int minFallingPathSum(int[][] grid) {
        int ans = Integer.MAX_VALUE;
		int[][] dp = new int[grid.length][grid[0].length];
		for(int[] arr : dp) {
			Arrays.fill(arr, -66666);
		}
		for(int col = 0; col < grid[0].length; col++) {
			ans = Math.min(ans, minPath(grid, 0, col, dp));
		}
        return ans;
    }
    public int minPath(int[][] matrix, int cr, int cc, int[][] dp) {
		if(cr == matrix.length - 1) {
			return matrix[cr][cc];
		}
		
		if(dp[cr][cc] != -66666) {
			return dp[cr][cc];
		}
		int ans = Integer.MAX_VALUE;
		for(int i = 0; i<matrix[0].length; i++) {
			if(i == cc) {
				continue;
			}
			ans = Math.min(ans, minPath(matrix, cr+1, i, dp));
		}
		return dp[cr][cc] = ans + matrix[cr][cc];
	}
}