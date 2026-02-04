// Last updated: 2/4/2026, 12:25:11 PM
class Solution {
    public int minimumPrefixLength(int[] nums) {
        int n= nums.length-1;
        int a=0;
        for( int i=n; i>=0;i--){
            if (i>0 && nums[i]<= nums[i-1]){a=i;break;}
        }
        return a;
    }
}