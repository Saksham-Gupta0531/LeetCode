// Last updated: 9/27/2025, 12:55:46 AM
class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int ans= 0;
        for(int i=0; i< nums.length ;i++){
            if (nums[i]%2==0) ans|=nums[i];
        }
        return ans;
    }
}