// Last updated: 10/24/2025, 10:30:47 PM
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        if (nums.length<3){
            return false;
        }
        for (int i=0;i<nums.length;i++){
            if (nums[i]<=first){
                first = nums[i];
            }
            else if (nums[i]<= second ){
                second =nums[i] ;
            }
            else{
                return true;
            }
        }
        return false;
    }
}