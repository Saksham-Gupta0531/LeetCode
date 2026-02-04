// Last updated: 2/4/2026, 12:28:42 PM
class Solution {
    public int minNonZeroProduct(int p) {
        if (p == 1) return 1;
        long mod = 1_000_000_007;

        long con = (1L << p) - 1;           
        long end = con - 1;                  
        long mid = (1L << (p - 1)) - 1;    
        long res = fastPow(end % mod, mid, mod);
        long ans = (res * (con % mod)) % mod;

        return (int) ans;
    }


    private long fastPow(long end, long exp, long mod) {
        if(exp == 0) return 1;
        long half = fastPow(end, exp/2, mod);
        long result = (half * half) % mod;

        if(exp%2 == 1) {
            result = (result * end) % mod;
        }

        return result;
    }
}