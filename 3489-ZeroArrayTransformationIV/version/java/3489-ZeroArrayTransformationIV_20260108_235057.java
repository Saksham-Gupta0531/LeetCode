// Last updated: 1/8/2026, 11:50:57 PM
1import java.util.*;
2
3class Solution {
4    public int minZeroArray(int[] nums, int[][] queries) {
5        return minOperations(nums, queries);
6    }
7
8    public int minOperations(int[] nums, int[][] queries) {
9        int left = 0, right = queries.length, answer = -1;
10
11        while (left <= right) {
12            int mid = (left + right) / 2;
13            if (canMakeZero(nums, queries, mid)) {
14                answer = mid;
15                right = mid - 1;
16            } else {
17                left = mid + 1;
18            }
19        }
20
21        return answer;
22    }
23
24    private boolean canMakeZero(int[] nums, int[][] queries, int k) {
25        int n = nums.length;
26        Map<Integer, List<Integer>> map = new HashMap<>();
27
28        for (int i = 0; i < n; i++) {
29            map.put(i, new ArrayList<>());
30        }
31
32        for (int i = 0; i < k; i++) {
33            int left = queries[i][0];
34            int ri = queries[i][1];
35            int vali = queries[i][2];
36            for (int j = left; j <= ri; j++) {
37                map.get(j).add(vali);
38            }
39        }
40
41        for (int i = 0; i < n; i++) {
42            int target = nums[i];
43            List<Integer> values = map.get(i);
44
45            if (!subop(values, target)) {
46                return false;
47            }
48        }
49        return true;
50    }
51
52    private boolean subop(List<Integer> values, int target) {
53        int size = values.size();
54        if (target == 0) return true;
55        if (size == 0) return false;
56
57        boolean[] dp = new boolean[target + 1];
58        dp[0] = true;
59
60        for (int num : values) {
61            for (int j = target; j >= num; j--) {
62                dp[j] |= dp[j - num];
63            }
64        }
65        return dp[target];
66    }
67}