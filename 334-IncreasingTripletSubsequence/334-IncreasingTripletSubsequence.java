// Last updated: 7/31/2025, 12:29:53 PM
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