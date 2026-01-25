// Last updated: 1/25/2026, 8:41:30 AM
1class Solution {
2    public int specialNodes(int n, int[][] edges, int x, int y, int z) {
3        List<Integer>[] g = new ArrayList[n];
4        for (int i = 0; i < n; i++)
5            g[i] = new ArrayList<>();
6        for (int[] e : edges) {
7            g[e[0]].add(e[1]);
8            g[e[1]].add(e[0]);
9        }
10        int[] dx = bfs(g, n, x), dy = bfs(g, n, y), dz = bfs(g, n, z);
11        int c = 0;
12        for (int i = 0; i < n; i++) {
13            int a = dx[i], b = dy[i], d = dz[i];
14            int[] t = { a, b, d };
15            Arrays.sort(t);
16            if (t[0] * t[0] + t[1] * t[1] == t[2] * t[2])
17                c++;
18        }
19        return c;
20    }
21
22    int[] bfs(List<Integer>[] g, int n, int s) {
23        int[] d = new int[n];
24        Arrays.fill(d, -1);
25        Queue<Integer> q = new ArrayDeque<>();
26        q.add(s);
27        d[s] = 0;
28        while (!q.isEmpty()) {
29            int u = q.poll();
30            for (int v : g[u])
31                if (d[v] == -1) {
32                    d[v] = d[u] + 1;
33                    q.add(v);
34                }
35        }
36        return d;
37    }
38}
39