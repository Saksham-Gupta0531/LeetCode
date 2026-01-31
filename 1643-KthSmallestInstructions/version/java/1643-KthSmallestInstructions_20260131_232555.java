// Last updated: 1/31/2026, 11:25:55 PM
1class Solution {
2    public int comb(int n, int r) {
3        int ans = 1;
4        for (int i = 1; i <= r; i++) {
5            ans = ans * (n - i + 1) / i;
6        }
7        return ans;
8    }
9
10    public String kthSmallestPath(int[] destination, int k) {
11        StringBuilder ans = new StringBuilder();
12        int y = destination[0];
13        int x = destination[1];
14        int n = x + y;
15
16        for (int i = 0; i < n; i++) {
17            if (x > 0) {
18                int c = comb(x + y - 1, x - 1);
19                if (k <= c) {
20                    ans.append('H');
21                    x--;
22                } else {
23                    ans.append('V');
24                    y--;
25                    k -= c;
26                }
27            } else {
28                ans.append('V');
29                y--;
30            }
31        }
32
33        return ans.toString();
34    }
35}