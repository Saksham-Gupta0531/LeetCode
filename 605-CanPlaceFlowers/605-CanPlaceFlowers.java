// Last updated: 2/4/2026, 12:31:30 PM
class Solution {
    public boolean canPlaceFlowers(int[] nums, int n) {
        if(n==0) return true;
        if (nums.length == 1) {
            if (nums[0] == 0) n--; 
            return n <= 0;
        }
        if (nums[0]==0 && nums[1]==0) {nums[0] =1; n--;}
        for(int i =1 ; i< nums.length-1 ;i++){
            if (nums[i] == 0){
                if (nums[i-1]==0 && nums[i+1]==0){
                    nums[i]=1;
                    n--;
                }
            }
            if(n==0) return true;
        }
    if ((nums[nums.length-1]==0 && nums[nums.length-2]==0)) {nums[nums.length-1] =1;n--;}
        if(n==0) return true;
        return false;
    }
}