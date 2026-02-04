// Last updated: 2/4/2026, 12:28:15 PM
class Solution {
    public int countTexts(String pressedKeys) {
        int n=pressedKeys.length();
        
        long [] dp = new long[n+1];
        dp[0]=1;
        dp[1]=1;
        
        for(int i=1;i<n;i++){
            char ch=pressedKeys.charAt(i);
            int j=i;
            if(ch!='7' && ch!='9'){
                while(j>0 && j>=i-2 && pressedKeys.charAt(j-1)==ch){
                    dp[i+1] += dp[j]%1000000007;
                    j--;
                }
                if(j!=i-3){
                    dp[i+1]+=dp[j]%1000000007;
                }
            }else{
                while(j>0 && j>=i-3 && pressedKeys.charAt(j-1)==ch){
                    dp[i+1] += dp[j]%1000000007;
                    j--;
                }
                if(j!=i-4){
                    dp[i+1]+=dp[j]%1000000007;
                }
            }
        }
        return (int) (dp[n]%1000000007);
    }
}