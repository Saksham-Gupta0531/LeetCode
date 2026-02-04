// Last updated: 2/4/2026, 12:26:37 PM
import java.util.*;

class Solution {
    public int findMaxVal(int n, int[][] restrictions, int[] diff) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int[] arr : restrictions) {
            map.put(arr[0], arr[1]);
        }

        long INF = (long) 1e18;
        long[] ans = new long[n];
        Arrays.fill(ans, INF);

        ans[0] = 0;

        for (int idx : map.keySet()) {
            ans[idx] = Math.min(ans[idx], map.get(idx));
        }

        for (int i = 1; i < n; i++) {
            ans[i] = Math.min(ans[i], ans[i - 1] + diff[i - 1]);
        }

        for (int i = n - 2; i >= 0; i--) {
            ans[i] = Math.min(ans[i], ans[i + 1] + diff[i]);
        }

        long res = 0;
        for (long v : ans) {
            res = Math.max(res, v);
        }

        return (int) res;
    }
}
