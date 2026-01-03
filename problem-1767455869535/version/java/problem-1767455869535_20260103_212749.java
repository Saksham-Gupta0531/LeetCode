// Last updated: 1/3/2026, 9:27:49 PM
1import java.util.*;
2
3class Solution {
4    public int findMaxVal(int n, int[][] restrictions, int[] diff) {
5
6        HashMap<Integer, Integer> map = new HashMap<>();
7        for (int[] arr : restrictions) {
8            map.put(arr[0], arr[1]);
9        }
10
11        long INF = (long) 1e18;
12        long[] ans = new long[n];
13        Arrays.fill(ans, INF);
14
15        ans[0] = 0;
16
17        for (int idx : map.keySet()) {
18            ans[idx] = Math.min(ans[idx], map.get(idx));
19        }
20
21        for (int i = 1; i < n; i++) {
22            ans[i] = Math.min(ans[i], ans[i - 1] + diff[i - 1]);
23        }
24
25        for (int i = n - 2; i >= 0; i--) {
26            ans[i] = Math.min(ans[i], ans[i + 1] + diff[i]);
27        }
28
29        long res = 0;
30        for (long v : ans) {
31            res = Math.max(res, v);
32        }
33
34        return (int) res;
35    }
36}
37