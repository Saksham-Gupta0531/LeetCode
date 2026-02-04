// Last updated: 2/4/2026, 12:28:30 PM
class Solution {
    public int minimumBuckets(String hamsters) {
        char[] dp = new char[hamsters.length()];
        for (int i = 0 ; i<hamsters.length() ;i++ ){
            if(i==0 ){
                if (hamsters.charAt(i)=='.') continue;
                if (hamsters.charAt(i)=='H' && hamsters.length()==1) return -1;
                if (hamsters.charAt(i)=='H' && hamsters.charAt(i+1)=='H') return -1;
            }
            else if(i==hamsters.length()-1){
                if (hamsters.charAt(i)=='H' && hamsters.charAt(i-1)=='H') return -1;
            }
            else if (i+1!=hamsters.length()-1)
                if (hamsters.charAt(i-1)=='H' && hamsters.charAt(i)=='H' && hamsters.charAt(i+1)=='H') return -1;
            if ( i!=0 && i!=hamsters.length()-1){
                if (hamsters.charAt(i)=='H' && dp[i-1]!='D' )
                    dp[i+1]='D';
            }
            else if(i==0 && hamsters.charAt(i)=='H')dp[1]='D';
            else if(i==hamsters.length()-1 && hamsters.charAt(i)=='H') dp[i-1]='D';
        }
        int c=0;
        for (char a: dp){
            if(a=='D')c++;
        }
        return c;
        
    }
}