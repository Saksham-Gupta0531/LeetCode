// Last updated: 11/16/2025, 8:04:58 AM
class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;
        for (int i : nums){
            if (i> max) {
                max2 = max;
                max=i;
            }
            else if ( i> max2){
                max2 =i;
            }
            if (min> i) min =i;
        }
        return max +max2 -min;
    }
}