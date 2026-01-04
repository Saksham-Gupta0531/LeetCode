// Last updated: 1/4/2026, 11:38:29 PM
1import java.util.*;
2
3class Solution {
4
5    class Pair {
6        int vtx;
7        long cost;
8        Pair(int vtx, long cost) {
9            this.vtx = vtx;
10            this.cost = cost;
11        }
12    }
13
14    public int countPaths(int n, int[][] roads) {
15        int MOD = 1_000_000_007;
16
17        // graph: node -> (neighbor -> weight)
18        HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
19        for (int i = 0; i < n; i++) {
20            map.put(i, new HashMap<>());
21        }
22
23        for (int[] r : roads) {
24            map.get(r[0]).put(r[1], r[2]);
25            map.get(r[1]).put(r[0], r[2]);
26        }
27
28        long[] dist = new long[n];
29        long[] ways = new long[n];
30        Arrays.fill(dist, Long.MAX_VALUE);
31
32        dist[0] = 0;
33        ways[0] = 1;
34
35        PriorityQueue<Pair> pq =
36                new PriorityQueue<>((a, b) -> Long.compare(a.cost, b.cost));
37        pq.add(new Pair(0, 0));
38
39        while (!pq.isEmpty()) {
40            Pair node = pq.poll();
41            int u = node.vtx;
42            long d = node.cost;
43
44            if (d > dist[u]) continue;
45
46            for (int v : map.get(u).keySet()) {
47                long wt = map.get(u).get(v);
48                long nd = d + wt;
49
50                if (nd < dist[v]) {
51                    dist[v] = nd;
52                    ways[v] = ways[u];
53                    pq.add(new Pair(v, nd));
54                }
55                else if (nd == dist[v]) {
56                    ways[v] = (ways[v] + ways[u]) % MOD;
57                }
58            }
59        }
60
61        return (int)(ways[n - 1] % MOD);
62    }
63}
64