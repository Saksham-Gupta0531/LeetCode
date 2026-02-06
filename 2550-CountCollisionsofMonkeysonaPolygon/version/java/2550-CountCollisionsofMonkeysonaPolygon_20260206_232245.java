// Last updated: 2/6/2026, 11:22:45 PM
1class Solution {
2    int mod = 1000000007;
3    public int monkeyMove(int n) {
4	
5        int ans = 1, cur = 2;
6        while (n > 0) {
7            if ((n & 1) == 1) {
8                ans = (int)((long)ans * (long)cur % (long)mod);
9            }
10            cur = (int)((long)cur * (long)cur % (long)mod);
11            n >>= 1;
12        }
13        return (ans - 2 + mod) % mod;
14    }
15}