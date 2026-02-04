// Last updated: 2/4/2026, 12:27:38 PM
class Solution {
    int mod = 1000000007;
    public int monkeyMove(int n) {
	
        int ans = 1, cur = 2;
        while (n > 0) {
            if ((n & 1) == 1) {
                ans = (int)((long)ans * (long)cur % (long)mod);
            }
            cur = (int)((long)cur * (long)cur % (long)mod);
            n >>= 1;
        }
        return (ans - 2 + mod) % mod;
    }
}