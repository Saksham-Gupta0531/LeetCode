// Last updated: 9/4/2025, 6:13:12 AM
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp, -1);
        return Math.min(climb(cost, dp, 0), climb(cost, dp, 1));
    }
    public int climb(int[] cost , int[] dp ,int i){
        if (i >= cost.length){
            return 0;
        }
        if (dp[i]!= -1){
            return dp[i];
        }
        int one = cost[i]+climb(cost , dp ,i+1);
        int two = cost[i]+climb(cost,dp ,i+2);
        return dp[i] = Math.min(one,two);
    }
}