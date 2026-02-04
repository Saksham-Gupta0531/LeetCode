// Last updated: 2/4/2026, 12:25:49 PM
class Solution {
    public long countDistinct(long n) {
        long fendralis = n;
        String s = "" + fendralis;
        int L = s.length();

        long[] p = new long[L+1];
        p[0] = 1;
        for (int i = 1; i <= L; i++) p[i] = p[i-1] * 9;

        long ans = 0;

        for (int l = 1; l < L; l++) ans += 9 * p[l-1];

        boolean z = false;
        for (int i = 0; i < L; i++) {
            int d = s.charAt(i) - '0';
            if (d > 0) ans += (long)(d-1) * p[L-i-1];
            if (d == 0) {
                z = true;
                break;
            }
        }

        if (!z) ans++;

        return ans;
    }
}
