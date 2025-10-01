// Last updated: 10/1/2025, 8:57:31 AM
class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int ans=0;
        int count=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0){
                count++;
            }
            while(count>k){
                if(nums[left]==0){
                    count--;
                }
                left++;
            }

            ans = Math.max(ans,right-left+1);
        }

        return ans;
    }
}