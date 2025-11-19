// Last updated: 11/19/2025, 12:00:53 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int count = 0; 
       int max = 0;
       for(int i = 0;i < nums.length; i++){
           if(nums[i]==1){
                count++;
                if(i==nums.length-1 && max < count){
                    max = count;
                }
            }else{
                if(max < count){
                    max=count;
                }
                count = 0;
            }
       }
        return max;
    }
}