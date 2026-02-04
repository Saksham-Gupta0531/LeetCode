// Last updated: 2/4/2026, 12:31:00 PM
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
    
        int a= nums[nums.length-1];
        int b= nums[0]*nums[1];
        int max = a*b;
        int f_max = Math.max(max,nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3] );
        return f_max;
    }
}