// Last updated: 2/4/2026, 12:32:33 PM
class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int x: nums){
            xor=xor^x;
        }
        int mask = xor & (~(xor-1));
        // int mask = xor & (-1*xor);
        int a = 0;
        for(int i =0 ; i<nums.length ;i++){
            if(( mask & nums[i])!=0){
                a = a^ nums[i];
            }
        }
        int b = xor^a;
        return new int[] {a,b};
    }
}