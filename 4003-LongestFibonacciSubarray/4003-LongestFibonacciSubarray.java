// Last updated: 2/4/2026, 12:26:15 PM
class Solution {
     public int longestSubarray(int[] nums) {
        if(nums.length < 3){
            return nums.length;
        }
        int v = nums[0];
        int w = nums[1];
        int c = 2;
        int ans = 2;
        for(int i = 2; i<nums.length; i++){
            if(nums[i] == v + w){
                c++;
            }
            else{
                c = 2;
            }
            ans = Math.max(ans, c);
            v = nums[i-1];
            w = nums[i];
        }
        return ans;
    }

}