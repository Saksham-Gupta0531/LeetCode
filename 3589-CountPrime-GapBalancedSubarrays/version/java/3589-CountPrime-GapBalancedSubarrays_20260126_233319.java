// Last updated: 1/26/2026, 11:33:19 PM
1class Solution {
2
3    private static final int M = 50000;
4    private static boolean[] p = new boolean[M + 1];
5    private static boolean done = false;
6
7    private void sieve() {
8        if (!done) {
9            Arrays.fill(p, true);
10            p[0] = p[1] = false;
11            for (int i = 2; i * i <= M; i++) {
12                if (p[i]) {
13                    for (int j = i * i; j <= M; j += i)
14                        p[j] = false;
15                }
16            }
17            done = true;
18        }
19    }
20
21    public int primeSubarray(int[] a, int k) {
22        sieve();
23        int n = a.length;
24        long ans = 0;
25
26        int[] f = new int[n];
27        for (int i = 0; i < n; i++) f[i] = p[a[i]] ? 1 : 0;
28
29        LinkedList<Integer> minQ = new LinkedList<>();
30        LinkedList<Integer> maxQ = new LinkedList<>();
31        LinkedList<Integer> primes = new LinkedList<>();
32
33        int l = 0;
34
35        for (int r = 0; r < n; r++) {
36            if (f[r] == 1) {
37                while (!minQ.isEmpty() && a[minQ.peekLast()] >= a[r]) minQ.pollLast();
38                minQ.addLast(r);
39
40                while (!maxQ.isEmpty() && a[maxQ.peekLast()] <= a[r]) maxQ.pollLast();
41                maxQ.addLast(r);
42
43                primes.addLast(r);
44            }
45
46            while (!minQ.isEmpty() && !maxQ.isEmpty()) {
47                int minV = a[minQ.peekFirst()];
48                int maxV = a[maxQ.peekFirst()];
49
50                if (maxV - minV > k) {
51                    if (minQ.peekFirst() == l) minQ.pollFirst();
52                    if (maxQ.peekFirst() == l) maxQ.pollFirst();
53                    if (!primes.isEmpty() && primes.peekFirst() == l) primes.pollFirst();
54                    l++;
55                } else break;
56            }
57
58            if (primes.size() >= 2) {
59                int x = primes.get(primes.size() - 2);
60                ans += (x - l + 1);
61            }
62        }
63
64        return (int) ans;  
65    }
66}