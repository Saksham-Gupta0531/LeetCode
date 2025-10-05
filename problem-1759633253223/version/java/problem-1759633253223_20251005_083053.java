// Last updated: 10/5/2025, 8:30:53 AM
class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int xor = 0;
        for (int v : nums) xor ^= v;
        if (xor != 0) return n;
        int p = 0, ans = 0;
        for (int i = 0; i < n; i++) {
            p ^= nums[i];
            if (p != 0) {
                ans = Math.max(ans, i + 1);
                ans = Math.max(ans, n - i - 1);
            }
        }
        return ans;
    }
}
