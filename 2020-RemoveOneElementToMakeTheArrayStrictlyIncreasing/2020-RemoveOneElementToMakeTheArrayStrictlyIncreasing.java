// Last updated: 9/13/2025, 2:20:59 PM
class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int i =0;
        int c=0;
        int p =0;
        while (i < nums.length-1){
            if (nums[i]>=nums[i+1]){
                c++;
                p=i;
            }
            i++;
        }
        if (c == 0) return true;           
        if (c > 1) return false;       

        if (p == 0 || p == nums.length - 2) return true;

        if (nums[p - 1] >= nums[p + 1] && (p + 2 < nums.length && nums[p + 2] <= nums[p])) 
            return false;

        return true;
}
}