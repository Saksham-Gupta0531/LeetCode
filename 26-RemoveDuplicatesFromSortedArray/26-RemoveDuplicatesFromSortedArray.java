// Last updated: 9/4/2025, 6:15:48 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1;
        for(int i=1;i<nums.length;i++){
            if (nums[i]!=nums[i-1]){
                nums[j]=nums[i];
                j++;
            }

        }
        return j;
    }
}