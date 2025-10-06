// Last updated: 10/6/2025, 6:38:04 PM
class Solution {
    public boolean isMatch(String s, String p) {
        int[][] dp = new int[s.length()+1][p.length() +1];
        return check(s, p ,s.length()-1, p.length()-1,dp);
    }



    public boolean check(String s ,String p, int i , int j,int[][] dp){

        //basecase 
        if (i<0 && j<0) return true;
        if (j<0) return false;
        else if (i<0 ){
            while(j>=0){
                if (p.charAt(j) !='*') return false;
                j--;
            }
            return true;
        }


        if (dp[i + 1][j + 1] != 0)
            return dp[i + 1][j + 1] == 1;

        boolean ans;
        if (s.charAt(i)== p.charAt(j) || p.charAt(j) == '?') 
            ans= check(s, p , i-1 ,j-1,dp );
        
        else if (p.charAt(j) =='*'){
            ans = check(s, p, i, j - 1, dp) || check(s, p, i - 1, j, dp);        
            }
        else
            ans= false;
        if(ans)
            dp[i+1][j+1] = 1;
        else
            dp[i+1][j+1] = -1;
        return ans ;
    }
}