// Last updated: 1/25/2026, 8:30:28 AM
1class Solution {
2    public int[] rotateElements(int[] nums, int k) {
3        List<Integer> idc = new ArrayList<>();
4        List<Integer> val = new ArrayList<>();
5
6        for (int i = 0; i < nums.length; i++) {
7            if (nums[i] >= 0) {
8                idc.add(i);
9                val.add(nums[i]);
10            }
11        }
12
13        int m = val.size();
14        if (m == 0) return nums;
15        k = k % m;
16
17        List<Integer> rotated = new ArrayList<>();
18        for (int i = 0; i < m; i++) {
19            rotated.add(val.get((i + k) % m));
20        }
21
22        for (int i = 0; i < m; i++) {
23            nums[idc.get(i)] = rotated.get(i);
24        }
25
26        return nums;
27    }
28}