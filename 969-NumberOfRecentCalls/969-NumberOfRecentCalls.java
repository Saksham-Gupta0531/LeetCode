// Last updated: 2/4/2026, 12:30:23 PM
class RecentCounter {
    Queue<Integer> q;
    public RecentCounter() {
        q = new LinkedList<>();
    }
    
    public int ping(int t) {
        int l = t-3000;
        while ( (!q.isEmpty()) && (q.peek() < l || q.peek() > t)) {
            int x = q.poll();
        }
        q.add(t);
        return q.size();
    }
}
/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */