// Last updated: 2/4/2026, 12:25:25 PM
class Solution {
    public int minLength(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        int sum = 0;
        int left = 0;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
            if (freq.get(nums[i]) == 1) {
                sum += nums[i];
            }
            while (sum >= k) {
                ans = Math.min(ans, i - left + 1);
                freq.put(nums[left], freq.get(nums[left]) - 1);
                if (freq.get(nums[left]) == 0) {
                    sum -= nums[left];
                }
                left++;
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}