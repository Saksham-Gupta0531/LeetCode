// Last updated: 9/3/2025, 5:28:03 PM
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l=0;
        int r=nums.length-1;
        while(l<r){
            if(nums[l]%2==1){
                int temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
                r--;
            }else{
                l++;
            }
        }
        return nums;
    }
}