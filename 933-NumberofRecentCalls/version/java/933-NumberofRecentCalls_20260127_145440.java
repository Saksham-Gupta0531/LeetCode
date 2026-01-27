// Last updated: 1/27/2026, 2:54:40 PM
1class RecentCounter {
2    Queue<Integer> q;
3    public RecentCounter() {
4        q = new LinkedList<>();
5    }
6    
7    public int ping(int t) {
8        int l = t-3000;
9        while ( (!q.isEmpty()) && (q.peek() < l || q.peek() > t)) {
10            int x = q.poll();
11        }
12        q.add(t);
13        return q.size();
14    }
15}
16/**
17 * Your RecentCounter object will be instantiated and called as such:
18 * RecentCounter obj = new RecentCounter();
19 * int param_1 = obj.ping(t);
20 */