// Last updated: 9/27/2025, 7:09:45 PM
class Solution {
    public int findPeakElement(int[] nums) {
        return search(nums, 0 ,nums.length-1);
    }
    public int search(int[] nums , int left ,int right){
        if (left == right ){
            return left;
        }
        int mid = left +(right -left)/2;

        // if ( nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1])  
        //     return mid;
        if(nums[mid]<nums[mid+1])
            return search(nums , mid+1,right );
        return search(nums ,left ,mid);
        
    }
}