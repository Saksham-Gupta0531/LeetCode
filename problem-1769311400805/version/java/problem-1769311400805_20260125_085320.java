// Last updated: 1/25/2026, 8:53:20 AM
1class Solution {
2    public long nthSmallest(long n, int k) {
3        long[][] c = new long[61][61];
4
5        for (int i = 0; i <= 60; i++) {
6                c[i][0] = c[i][i] = 1;
7                for (int j = 1; j < i; j++)
8                    c[i][j] = Math.min((long) 1e18, c[i - 1][j - 1] + c[i - 1][j]);
9        }
10    
11            long ans = 0;
12            int ones = k;
13            for (int bit = 60; bit >= 0; bit--) {
14                if (ones == 0)
15                    break;
16                long cnt = c[bit][ones];
17                if (cnt < n) {
18                    n -= cnt;
19                    ans |= 1L << bit;
20                    ones--;
21                }
22            }
23            return ans;
24    }
25}