// Last updated: 1/31/2026, 11:09:00 PM
1class Solution {
2    public int minNonZeroProduct(int p) {
3        if (p == 1) return 1;
4        long mod = 1_000_000_007;
5
6        long con = (1L << p) - 1;           
7        long end = con - 1;                  
8        long mid = (1L << (p - 1)) - 1;    
9        long res = fastPow(end % mod, mid, mod);
10        long ans = (res * (con % mod)) % mod;
11
12        return (int) ans;
13    }
14
15
16    private long fastPow(long end, long exp, long mod) {
17        if(exp == 0) return 1;
18        long half = fastPow(end, exp/2, mod);
19        long result = (half * half) % mod;
20
21        if(exp%2 == 1) {
22            result = (result * end) % mod;
23        }
24
25        return result;
26    }
27}