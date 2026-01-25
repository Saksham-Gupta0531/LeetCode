// Last updated: 1/25/2026, 8:11:59 AM
1class Solution {
2    public int minimumPrefixLength(int[] nums) {
3        int n= nums.length-1;
4        int a=0;
5        for( int i=n; i>=0;i--){
6            if (i>0 && nums[i]<= nums[i-1]){a=i;break;}
7        }
8        return a;
9    }
10}