// Last updated: 2/4/2026, 12:32:06 PM
class Solution {
    public boolean canPartition(int[] nums) {
        int sum =0 ; 
        for (int i =0 ; i < nums.length ; i++){
            sum+=nums[i];
        }
        if (sum%2!=0) return false ;
        return partiton(nums , 0 , sum/2, new Boolean[nums.length][sum/2+1]);
    }

    public boolean partiton(int[] nums , int i, int sum, Boolean[][] dp ){
        if (sum ==0) return true;

        if (i==nums.length || sum<0) return false;
        if (dp[i][sum]!=null) return dp[i][sum];
        boolean a =partiton(nums, i+1, sum-nums[i],dp);
        boolean b= partiton(nums, i+1, sum,dp);
        return dp[i][sum]=(a||b);

    }
}