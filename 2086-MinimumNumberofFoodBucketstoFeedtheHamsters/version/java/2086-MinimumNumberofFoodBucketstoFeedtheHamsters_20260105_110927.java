// Last updated: 1/5/2026, 11:09:27 AM
1class Solution {
2    public int minimumBuckets(String hamsters) {
3        char[] dp = new char[hamsters.length()];
4        for (int i = 0 ; i<hamsters.length() ;i++ ){
5            if(i==0 ){
6                if (hamsters.charAt(i)=='.') continue;
7                if (hamsters.charAt(i)=='H' && hamsters.length()==1) return -1;
8                if (hamsters.charAt(i)=='H' && hamsters.charAt(i+1)=='H') return -1;
9            }
10            else if(i==hamsters.length()-1){
11                if (hamsters.charAt(i)=='H' && hamsters.charAt(i-1)=='H') return -1;
12            }
13            else if (i+1!=hamsters.length()-1)
14                if (hamsters.charAt(i-1)=='H' && hamsters.charAt(i)=='H' && hamsters.charAt(i+1)=='H') return -1;
15            if ( i!=0 && i!=hamsters.length()-1){
16                if (hamsters.charAt(i)=='H' && dp[i-1]!='D' )
17                    dp[i+1]='D';
18            }
19            else if(i==0 && hamsters.charAt(i)=='H')dp[1]='D';
20            else if(i==hamsters.length()-1 && hamsters.charAt(i)=='H') dp[i-1]='D';
21        }
22        int c=0;
23        for (char a: dp){
24            if(a=='D')c++;
25        }
26        return c;
27        
28    }
29}