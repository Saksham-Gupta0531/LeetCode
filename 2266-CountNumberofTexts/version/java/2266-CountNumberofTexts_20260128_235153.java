// Last updated: 1/28/2026, 11:51:53 PM
1class Solution {
2    public int countTexts(String pressedKeys) {
3        int n=pressedKeys.length();
4        
5        long [] dp = new long[n+1];
6        dp[0]=1;
7        dp[1]=1;
8        
9        for(int i=1;i<n;i++){
10            char ch=pressedKeys.charAt(i);
11            int j=i;
12            if(ch!='7' && ch!='9'){
13                while(j>0 && j>=i-2 && pressedKeys.charAt(j-1)==ch){
14                    dp[i+1] += dp[j]%1000000007;
15                    j--;
16                }
17                if(j!=i-3){
18                    dp[i+1]+=dp[j]%1000000007;
19                }
20            }else{
21                while(j>0 && j>=i-3 && pressedKeys.charAt(j-1)==ch){
22                    dp[i+1] += dp[j]%1000000007;
23                    j--;
24                }
25                if(j!=i-4){
26                    dp[i+1]+=dp[j]%1000000007;
27                }
28            }
29        }
30        return (int) (dp[n]%1000000007);
31    }
32}