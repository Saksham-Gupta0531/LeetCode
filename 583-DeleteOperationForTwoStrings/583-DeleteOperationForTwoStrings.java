// Last updated: 7/31/2025, 12:29:11 PM
class Solution {
    //S1.) Find out the length jo ki same h dono m ab uske alawa sb hatana h OR ghusana h.
    int length=0;
    int [][] dp;
    public int minDistance(String word1, String word2) {
        dp=new int[word1.length()+1][word2.length()+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        return (word1.length()+word2.length())-(2*findCommon(0,0,word1,word2));
    }
// Calculates the LCS
    public int findCommon(int index1,int index2,String word1, String word2){
        if(index1>=word1.length() || index2>=word2.length()){
            return 0;
        }
        if(dp[index1][index2]!=-1){
            return dp[index1][index2];
        }
        if(word1.charAt(index1)==word2.charAt(index2)){
            return dp[index1][index2]=1+findCommon(index1+1,index2+1,word1,word2);
        }
        return dp[index1][index2]=Math.max(findCommon(index1,index2+1,word1,word2),findCommon(index1+1,index2,word1,word2));

    }
}