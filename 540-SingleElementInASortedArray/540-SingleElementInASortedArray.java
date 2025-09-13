// Last updated: 9/13/2025, 2:21:37 PM
class Solution {
    public int singleNonDuplicate(int[] nums) {
        if (nums.length ==1) return nums[0];
        if (nums[0]!=nums[1]) return nums[0];
        
        int first=0 ;
        int last = nums.length-1;
        if (nums[last]!= nums[last-1]) return nums[last];
        while (first<last){
            int mid = ( first+ (last-first)/2);
            if (nums[mid]!= nums[mid+1] && nums[mid]!=nums[mid-1]) return nums[mid];
            else if(nums[mid]==nums[mid-1] ){
                if ((mid-1) %2 ==0){
                    first = mid+1;
                }
                else last = mid -1;
            }
            else if(nums[mid]==nums[mid+1] ){
                if (mid %2 ==0){
                    first = mid+1;
                }
                else last = mid -1;
            }
        }
    return nums[first];
    }
}