// Last updated: 2/4/2026, 12:25:16 PM
class Solution {
    public int[] rotateElements(int[] nums, int k) {
        List<Integer> idc = new ArrayList<>();
        List<Integer> val = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                idc.add(i);
                val.add(nums[i]);
            }
        }

        int m = val.size();
        if (m == 0) return nums;
        k = k % m;

        List<Integer> rotated = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            rotated.add(val.get((i + k) % m));
        }

        for (int i = 0; i < m; i++) {
            nums[idc.get(i)] = rotated.get(i);
        }

        return nums;
    }
}