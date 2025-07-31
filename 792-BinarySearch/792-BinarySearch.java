// Last updated: 7/31/2025, 12:29:05 PM
class Solution {
    public int search(int[] nums, int target) {
        return (find(nums ,target));
    }
    public static int find(int[] nums, int target){
        int first=0;
        int last=nums.length-1;
        while( first <= last ){
            int mid=(first + last)/2;
            if ( nums[mid]  == target )
                return mid;

            else if( nums[mid] < target)
                first = mid+1;

            else
                last = mid-1;
        }
        return -1 ;
    }

}