// Last updated: 9/3/2025, 5:28:02 PM
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int ev =0;
        int od =1;
        int[] arr = new int[nums.length];
        for(int i =0 ;i< nums.length ;i++){
            if (nums[i]%2 == 0){
                arr[ev]= nums[i];
                ev =ev+2;
            }
            else{
                arr[od]=nums[i];
                od =od+2;
            }
        }
        return arr;
    }
}