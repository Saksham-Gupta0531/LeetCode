// Last updated: 2/4/2026, 12:31:47 PM
class Solution {
    public int comb(int n, int r) {
        int ans = 1;
        for (int i = 1; i <= r; i++) {
            ans = ans * (n - i + 1) / i;
        }
        return ans;
    }

    public String kthSmallestPath(int[] destination, int k) {
        StringBuilder ans = new StringBuilder();
        int y = destination[0];
        int x = destination[1];
        int n = x + y;

        for (int i = 0; i < n; i++) {
            if (x > 0) {
                int c = comb(x + y - 1, x - 1);
                if (k <= c) {
                    ans.append('H');
                    x--;
                } else {
                    ans.append('V');
                    y--;
                    k -= c;
                }
            } else {
                ans.append('V');
                y--;
            }
        }

        return ans.toString();
    }
}