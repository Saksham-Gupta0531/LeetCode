// Last updated: 9/3/2025, 9:00:07 PM
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] costDp = new int[cost.length + 2];
        for(int i = cost.length - 1; i >= 0; i--) {
            costDp[i] = cost[i] + Math.min(costDp[i + 1], costDp[i + 2]);
        }
        return Math.min(costDp[0], costDp[1]);
    }
}