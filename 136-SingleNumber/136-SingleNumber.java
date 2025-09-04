// Last updated: 9/4/2025, 6:14:42 AM
class Solution {
    public int singleNumber(int[] nums) {
        int a=0;
        for(int x: nums)
            a=x^a;
        return a;
    }
}