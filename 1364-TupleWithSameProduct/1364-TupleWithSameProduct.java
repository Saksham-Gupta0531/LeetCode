// Last updated: 2/4/2026, 12:29:49 PM
class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int cnt = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int prod = nums[i] * nums[j];
                freq.put(prod, freq.getOrDefault(prod, 0) + 1);
            }
        }
        for (int key : freq.keySet()) {
            int k = freq.get(key);
            if (k > 1) {
                cnt += (k * (k - 1) / 2) * 8;
            }
        }
        return cnt;

    }
}