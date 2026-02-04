// Last updated: 2/4/2026, 12:26:50 PM
class Solution {

    class Node {
        String cur;
        double val;

        Node(String c, double v) {
            cur = c;
            val = v;
        }
    }

    double ans;
    Map<String, List<Node>> g1, g2;

    private void dfs(String src, double amt, String target, int step, Set<String> vis) {

        if (src.equals(target)) {
            ans = Math.max(ans, amt);
            if (step == 2) return;
        }

        List<Node> adj;
        if (step == 1) adj = g1.getOrDefault(src, new ArrayList<>());
        else adj = g2.getOrDefault(src, new ArrayList<>());

        for (Node nei : adj) {
            if (vis.add(nei.cur)) {
                dfs(nei.cur, amt * nei.val, target, step, vis);
                vis.remove(nei.cur);
            }
        }

        if (step == 1) {
            dfs(src, amt, target, step + 1, new HashSet<>());
        }
    }

    public double maxAmount(
            String start,
            List<List<String>> p1, double[] r1,
            List<List<String>> p2, double[] r2) {

        g1 = new HashMap<>();
        g2 = new HashMap<>();

        int n = p1.size();
        for (int i = 0; i < n; i++) {
            String a = p1.get(i).get(0);
            String b = p1.get(i).get(1);

            g1.computeIfAbsent(a, k -> new ArrayList<>()).add(new Node(b, r1[i]));
            g1.computeIfAbsent(b, k -> new ArrayList<>()).add(new Node(a, 1d / r1[i]));
        }

        n = p2.size();
        for (int i = 0; i < n; i++) {
            String a = p2.get(i).get(0);
            String b = p2.get(i).get(1);

            g2.computeIfAbsent(a, k -> new ArrayList<>()).add(new Node(b, r2[i]));
            g2.computeIfAbsent(b, k -> new ArrayList<>()).add(new Node(a, 1d / r2[i]));
        }

        ans = 1d;
        dfs(start, 1d, start, 1, new HashSet<>());
        return ans;
    }
}


