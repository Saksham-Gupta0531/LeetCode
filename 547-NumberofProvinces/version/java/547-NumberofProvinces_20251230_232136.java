// Last updated: 12/30/2025, 11:21:36 PM
1class Solution {
2
3    public int findCircleNum(int[][] M) {
4
5        if (M == null || M.length == 0) return 0;
6
7        int n = M.length;
8        boolean[] visited = new boolean[n];
9        int count = 0;
10
11        for (int i = 0; i < n; i++) {
12            if (!visited[i]) {
13                count++;
14                dfs(i, M, visited, n);
15            }
16        }
17
18        return count;
19    }
20
21    private void dfs(int u, int[][] M, boolean[] visited, int n) {
22        visited[u] = true;
23
24        for (int v = 0; v < n; v++) {
25            if (M[u][v] == 1 && !visited[v]) {
26                dfs(v, M, visited, n);
27            }
28        }
29    }
30}
31