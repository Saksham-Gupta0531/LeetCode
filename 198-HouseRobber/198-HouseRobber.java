// Last updated: 9/4/2025, 6:14:24 AM
class Solution {

    public int rob(int[] arr) {
        int[] dp = new int[arr.length];
        Arrays.fill(dp,-1);
        return robber(arr , 0,dp);
        
    }
    public  int robber(int[] arr ,int i ,int[] dp){
        if (i>=arr.length){
            return 0;
        }
        if (dp[i] != -1){
            return dp[i];
        }
        int rob = arr[i]+ robber(arr ,i+2,dp);
        int drob = robber(arr,i+1,dp);
        return dp[i] = Math.max(rob ,drob);
    }
    
    

}