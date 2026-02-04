// Last updated: 2/4/2026, 12:25:18 PM
class Solution {
    public long nthSmallest(long n, int k) {
        long[][] c = new long[61][61];

        for (int i = 0; i <= 60; i++) {
                c[i][0] = c[i][i] = 1;
                for (int j = 1; j < i; j++)
                    c[i][j] = Math.min((long) 1e18, c[i - 1][j - 1] + c[i - 1][j]);
        }
    
            long ans = 0;
            int ones = k;
            for (int bit = 60; bit >= 0; bit--) {
                if (ones == 0)
                    break;
                long cnt = c[bit][ones];
                if (cnt < n) {
                    n -= cnt;
                    ans |= 1L << bit;
                    ones--;
                }
            }
            return ans;
    }
}