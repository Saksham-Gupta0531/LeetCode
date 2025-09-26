// Last updated: 9/27/2025, 12:55:44 AM
class Solution {
    public long maxTotalValue(int[] nums, int k) {
        // int[] nums ={4,2,5,1};
        // int k=3;
        int n = nums.length;
        int maxv = Integer.MIN_VALUE;
        int minv = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            if(nums[i] > maxv) maxv = nums[i];
            if(nums[i] < minv) minv = nums[i];
        }

        long diff = (long)maxv - (long)minv;
        long ans_long = diff * (long)k;
        return ans_long;  
    }
}