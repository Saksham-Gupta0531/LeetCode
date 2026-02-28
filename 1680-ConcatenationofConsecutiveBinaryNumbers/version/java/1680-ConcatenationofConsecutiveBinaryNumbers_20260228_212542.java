// Last updated: 2/28/2026, 9:25:42 PM
1class Solution {
2    public int concatenatedBinary(int n) {
3        final long MOD = (long)(1e9 + 7);
4        long res = 0;
5        for (int i = 1; i <= n; i++) {
6            int bits = 32 - Integer.numberOfLeadingZeros(i);
7            res = ((res << bits) + i) % MOD;
8        }
9
10        return (int)res;
11    }
12}