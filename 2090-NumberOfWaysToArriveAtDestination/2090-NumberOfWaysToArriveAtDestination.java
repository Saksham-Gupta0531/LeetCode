// Last updated: 2/4/2026, 12:28:44 PM
import java.util.*;

class Solution {

    class Pair {
        int vtx;
        long cost;
        Pair(int vtx, long cost) {
            this.vtx = vtx;
            this.cost = cost;
        }
    }

    public int countPaths(int n, int[][] roads) {
        int MOD = 1_000_000_007;

        // graph: node -> (neighbor -> weight)
        HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(i, new HashMap<>());
        }

        for (int[] r : roads) {
            map.get(r[0]).put(r[1], r[2]);
            map.get(r[1]).put(r[0], r[2]);
        }

        long[] dist = new long[n];
        long[] ways = new long[n];
        Arrays.fill(dist, Long.MAX_VALUE);

        dist[0] = 0;
        ways[0] = 1;

        PriorityQueue<Pair> pq =
                new PriorityQueue<>((a, b) -> Long.compare(a.cost, b.cost));
        pq.add(new Pair(0, 0));

        while (!pq.isEmpty()) {
            Pair node = pq.poll();
            int u = node.vtx;
            long d = node.cost;

            if (d > dist[u]) continue;

            for (int v : map.get(u).keySet()) {
                long wt = map.get(u).get(v);
                long nd = d + wt;

                if (nd < dist[v]) {
                    dist[v] = nd;
                    ways[v] = ways[u];
                    pq.add(new Pair(v, nd));
                }
                else if (nd == dist[v]) {
                    ways[v] = (ways[v] + ways[u]) % MOD;
                }
            }
        }

        return (int)(ways[n - 1] % MOD);
    }
}
