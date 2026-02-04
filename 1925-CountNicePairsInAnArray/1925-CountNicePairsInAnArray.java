// Last updated: 2/4/2026, 12:29:00 PM
class Solution {
    public int countNicePairs(int[] nums) {
        int mod = 1000000007;
        HashMap<Integer, Long> map = new HashMap<>();
        long ans = 0;

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i] - rev(nums[i]);
            if (map.containsKey(x)) {
                ans = (ans + map.get(x)) % mod;
            }
            map.put(x, map.getOrDefault(x, 0L) + 1);
        }
        return (int) ans;
    }

    int rev(int n) {
        int r = 0;
        while (n > 0) {
            r = r * 10 + n % 10;
            n /= 10;
        }
        return r;
    }
}
