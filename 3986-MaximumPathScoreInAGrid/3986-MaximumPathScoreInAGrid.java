// Last updated: 2/4/2026, 12:26:17 PM
class Solution {
    Integer[][][] dp;

    public int maxPathScore(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        dp = new Integer[m][n][k + 1];
        int res = dfs(grid, k, 0, 0, 0);
        return res < 0 ? -1 : res;
    }

    int dfs(int[][] grid, int k, int cost, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;
        if (i >= m || j >= n) return -1;

        int cell = grid[i][j];
        int c = (cell == 0 ? 0 : 1);
        int nc = cost + c;
        if (nc > k) 
            return -1;

        if (i == m - 1 && j == n - 1) 
            return cell;

        if (dp[i][j][nc] != null) 
            return dp[i][j][nc];

        int a = dfs(grid, k, nc, i + 1, j);
        int b = dfs(grid, k, nc, i, j + 1);
        int mx = Math.max(a, b);

        if (mx < 0) 
            return dp[i][j][nc] = -1;
        return dp[i][j][nc] = cell + mx;
    }
}
