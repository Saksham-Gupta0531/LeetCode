// Last updated: 2/4/2026, 12:25:13 PM
class Solution {
    public int specialNodes(int n, int[][] edges, int x, int y, int z) {
        List<Integer>[] g = new ArrayList[n];
        for (int i = 0; i < n; i++)
            g[i] = new ArrayList<>();
        for (int[] e : edges) {
            g[e[0]].add(e[1]);
            g[e[1]].add(e[0]);
        }
        int[] dx = bfs(g, n, x), dy = bfs(g, n, y), dz = bfs(g, n, z);
        int c = 0;
        for (int i = 0; i < n; i++) {
            int a = dx[i], b = dy[i], d = dz[i];
            int[] t = { a, b, d };
            Arrays.sort(t);
            if (t[0] * t[0] + t[1] * t[1] == t[2] * t[2])
                c++;
        }
        return c;
    }

    int[] bfs(List<Integer>[] g, int n, int s) {
        int[] d = new int[n];
        Arrays.fill(d, -1);
        Queue<Integer> q = new ArrayDeque<>();
        q.add(s);
        d[s] = 0;
        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v : g[u])
                if (d[v] == -1) {
                    d[v] = d[u] + 1;
                    q.add(v);
                }
        }
        return d;
    }
}
