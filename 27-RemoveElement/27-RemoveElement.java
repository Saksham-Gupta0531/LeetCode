// Last updated: 9/4/2025, 6:15:46 AM
class Solution {
    public int removeElement(int[] nums, int val) {
        int j=0;
        for(int i: nums){
            if (i!= val){
                nums[j]=i;
                j++;
            }

        }
        return j;
    }
}