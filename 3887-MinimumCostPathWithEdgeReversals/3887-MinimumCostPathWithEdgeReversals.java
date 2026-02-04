// Last updated: 2/4/2026, 12:26:28 PM
import java.util.*;

class Solution {

    static class Pair {
        int node;
        long cost;

        Pair(int node, long cost) {
            this.node = node;
            this.cost = cost;
        }
    }

    public int minCost(int n, int[][] edges) {

        Map<Integer, Set<Integer>> outgoing = new HashMap<>();
        Map<Integer, Set<Integer>> incoming = new HashMap<>();
        Map<Long, Integer> weight = new HashMap<>();

        // Build graph
        for (int[] e : edges) {
            int u = e[0], v = e[1], w = e[2];

            outgoing.computeIfAbsent(u, k -> new HashSet<>()).add(v);
            incoming.computeIfAbsent(v, k -> new HashSet<>()).add(u);

            long key = (((long) u) << 32) | v;
            weight.put(key, Math.min(weight.getOrDefault(key, Integer.MAX_VALUE), w));
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a.cost));
        long[] dist = new long[n];
        Arrays.fill(dist, Long.MAX_VALUE);

        dist[0] = 0;
        pq.add(new Pair(0, 0));

        while (!pq.isEmpty()) {
            Pair cur = pq.poll();
            int node = cur.node;
            long cost = cur.cost;

            if (node == n - 1) return (int) cost;
            if (cost > dist[node]) continue;

            // Outgoing edges (normal cost)
            if (outgoing.containsKey(node)) {
                for (int next : outgoing.get(node)) {
                    long key = (((long) node) << 32) | next;
                    long newCost = dist[node] + weight.get(key);
                    if (newCost < dist[next]) {
                        dist[next] = newCost;
                        pq.add(new Pair(next, newCost));
                    }
                }
            }

            if (incoming.containsKey(node)) {
                for (int prev : incoming.get(node)) {
                    long key = (((long) prev) << 32) | node;
                    long newCost = dist[node] + 2L * weight.get(key);
                    if (newCost < dist[prev]) {
                        dist[prev] = newCost;
                        pq.add(new Pair(prev, newCost));
                    }
                }
            }
        }

        return -1;
    }
}
