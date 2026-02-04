// Last updated: 2/4/2026, 12:31:36 PM
class Solution {

    public int findCircleNum(int[][] M) {

        if (M == null || M.length == 0) return 0;

        int n = M.length;
        boolean[] visited = new boolean[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                count++;
                dfs(i, M, visited, n);
            }
        }

        return count;
    }

    private void dfs(int u, int[][] M, boolean[] visited, int n) {
        visited[u] = true;

        for (int v = 0; v < n; v++) {
            if (M[u][v] == 1 && !visited[v]) {
                dfs(v, M, visited, n);
            }
        }
    }
}
