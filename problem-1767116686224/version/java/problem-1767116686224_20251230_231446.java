// Last updated: 12/30/2025, 11:14:46 PM
1import java.util.*;
2
3class Solution {
4
5    static class Pair {
6        int node;
7        long cost;
8
9        Pair(int node, long cost) {
10            this.node = node;
11            this.cost = cost;
12        }
13    }
14
15    public int minCost(int n, int[][] edges) {
16
17        Map<Integer, Set<Integer>> outgoing = new HashMap<>();
18        Map<Integer, Set<Integer>> incoming = new HashMap<>();
19        Map<Long, Integer> weight = new HashMap<>();
20
21        // Build graph
22        for (int[] e : edges) {
23            int u = e[0], v = e[1], w = e[2];
24
25            outgoing.computeIfAbsent(u, k -> new HashSet<>()).add(v);
26            incoming.computeIfAbsent(v, k -> new HashSet<>()).add(u);
27
28            long key = (((long) u) << 32) | v;
29            weight.put(key, Math.min(weight.getOrDefault(key, Integer.MAX_VALUE), w));
30        }
31
32        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a.cost));
33        long[] dist = new long[n];
34        Arrays.fill(dist, Long.MAX_VALUE);
35
36        dist[0] = 0;
37        pq.add(new Pair(0, 0));
38
39        while (!pq.isEmpty()) {
40            Pair cur = pq.poll();
41            int node = cur.node;
42            long cost = cur.cost;
43
44            if (node == n - 1) return (int) cost;
45            if (cost > dist[node]) continue;
46
47            // Outgoing edges (normal cost)
48            if (outgoing.containsKey(node)) {
49                for (int next : outgoing.get(node)) {
50                    long key = (((long) node) << 32) | next;
51                    long newCost = dist[node] + weight.get(key);
52                    if (newCost < dist[next]) {
53                        dist[next] = newCost;
54                        pq.add(new Pair(next, newCost));
55                    }
56                }
57            }
58
59            if (incoming.containsKey(node)) {
60                for (int prev : incoming.get(node)) {
61                    long key = (((long) prev) << 32) | node;
62                    long newCost = dist[node] + 2L * weight.get(key);
63                    if (newCost < dist[prev]) {
64                        dist[prev] = newCost;
65                        pq.add(new Pair(prev, newCost));
66                    }
67                }
68            }
69        }
70
71        return -1;
72    }
73}
74