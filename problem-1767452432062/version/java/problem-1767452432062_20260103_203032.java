// Last updated: 1/3/2026, 8:30:32 PM
1class Solution {
2    public int minLength(int[] nums, int k) {
3        Map<Integer, Integer> freq = new HashMap<>();
4        int sum = 0;
5        int left = 0;
6        int ans = Integer.MAX_VALUE;
7        for (int i = 0; i < nums.length; i++) {
8            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
9            if (freq.get(nums[i]) == 1) {
10                sum += nums[i];
11            }
12            while (sum >= k) {
13                ans = Math.min(ans, i - left + 1);
14                freq.put(nums[left], freq.get(nums[left]) - 1);
15                if (freq.get(nums[left]) == 0) {
16                    sum -= nums[left];
17                }
18                left++;
19            }
20        }
21
22        return ans == Integer.MAX_VALUE ? -1 : ans;
23    }
24}