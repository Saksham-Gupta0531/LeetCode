// Last updated: 1/12/2026, 10:31:18 PM
1class Solution {
2    public int longestBalanced(int[] nums) {
3        int n =nums.length;
4        int ans=0;
5        for (int i = 0; i < n; i++) {
6            HashSet<Integer> even = new HashSet<>();
7            HashSet<Integer> odd = new HashSet<>();
8            for (int j = i; j < n; j++) {
9                if (nums[j] % 2 == 0) even.add(nums[j]);
10                else odd.add(nums[j]);
11                if (even.size() == odd.size()) {
12                    ans = Math.max(ans, j - i + 1);
13                }
14            }
15        }
16        return ans;
17    }
18}