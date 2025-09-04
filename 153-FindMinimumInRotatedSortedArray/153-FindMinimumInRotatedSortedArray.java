// Last updated: 9/4/2025, 6:14:34 AM
class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high= nums.length-1;
        while (low<high){
            int  mid= (low+high)/2;
            if (nums[mid]<nums[high]){
                high = mid;
            }
            else
                low =mid+1;
        }
        return nums[low];
    }
}