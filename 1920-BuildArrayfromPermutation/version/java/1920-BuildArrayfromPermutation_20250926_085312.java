// Last updated: 9/26/2025, 8:53:12 AM
class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length]; 
        for (int i=0 ; i< nums.length ;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}