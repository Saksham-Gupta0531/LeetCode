// Last updated: 2/4/2026, 12:29:18 PM
class Solution {
    private static final int FORWARD = 1;
    private static final int BACKWARD = 2;
    public int minimumJumps(int[] forbidden, int a, int b, int x) {
        Queue<int[]> q = new LinkedList();
        q.add(new int[] {0, FORWARD});
        Set<String> visited = new HashSet();
        Set<Integer> forbiddenSet = new HashSet();
        int farthest = 2000 + 2 * b;
        for (int f: forbidden) {
            farthest = Math.max(farthest, f + 2 * b);
            forbiddenSet.add(f);
        }
        int step = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] current = q.poll();
                if (current[0] == x) {
                    return step;
                }
                
                int forward = current[0] + a;
                int backward = current[0] - b;
                
                if (forward <= farthest && !visited.contains(forward + "|" + FORWARD) && !forbiddenSet.contains(forward)) {
                    visited.add(forward + "|" + FORWARD);
                    q.add(new int[] {forward, FORWARD});
                }
                
                if (current[1] != BACKWARD && backward >= 0 && !visited.contains(backward + "|" + BACKWARD) && !forbiddenSet.contains(backward)) {
                    visited.add(backward + "|" + BACKWARD);
                    q.add(new int[] {backward, BACKWARD});
                }
            }
            step++;
        }
        return -1;
    }
}