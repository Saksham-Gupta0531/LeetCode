// Last updated: 9/18/2025, 9:27:30 PM
class Solution {
    public int maxProduct(int[] nums) {
        int prefix= 1;
        int suffix= 1;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++){
            prefix = prefix * nums[i];
            suffix = suffix * nums[nums.length-i-1];
            maxi = Math.max(prefix , Math.max(suffix , maxi));
            if (nums[i]==0){
                prefix = 1;
            }
            else if(nums[nums.length-i-1] == 0) suffix = 1;
        }
        return maxi;
    }
}