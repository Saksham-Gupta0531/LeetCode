// Last updated: 7/31/2025, 12:28:43 PM
import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ne = new int[nums.length];
        int l=0;
        int r=nums.length-1;
        for(int i=nums.length-1;i>=0 ;i--){
            if (Math.abs(nums[l])> Math.abs(nums[r])){
                ne[i]=nums[l]*nums[l];
                l++;
            }
            else{
                ne[i]=nums[r]*nums[r];
                r--;
            }
        }
        return ne; 
    }
}