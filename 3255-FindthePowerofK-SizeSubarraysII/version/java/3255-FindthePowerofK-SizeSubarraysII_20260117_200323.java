// Last updated: 1/17/2026, 8:03:23 PM
1class Solution {
2    public int[] resultsArray(int[] nums, int k) {
3        int n = nums.length;
4        int c = 1;
5        if(k == 1) return nums;
6        int[] res = new int[n-k+1];
7        Arrays.fill(res, -1);
8
9        for(int i=1; i<n; i++){
10            if(nums[i] != nums[i-1]+1)
11            c = 1;
12            else{
13                c++;
14                if(c >= k)
15                res[i-k+1] = nums[i];
16            }
17        }
18        return res;
19    }
20}