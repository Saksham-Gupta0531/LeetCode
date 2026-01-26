// Last updated: 1/26/2026, 11:32:35 PM
1class Solution {
2    int max = 0;
3    public int longestPalindrome(String s, String t) {
4        String s2 = new StringBuilder(t).reverse().toString();
5        // String s2 = t;
6        // System.out.println(s);
7        // System.out.println(s2);
8        
9        int n = s.length();
10        int m = s2.length();
11        
12        boolean[][] palin1 = palinDp(s);
13        boolean[][] palin2 = palinDp(s2);
14
15        int[] dp1 = getDp(s, palin1);
16        int[] dp2 = getDp(s2, palin2);
17
18        int[][] dp = new int[n+1][m+1];
19        for(int i=1;i<=n;i++){
20            for(int j=1;j<=m;j++){
21                if(s.charAt(i-1)==s2.charAt(j-1)){
22                    dp[i][j] = dp[i-1][j-1]+1;
23                    // System.out.println("commong string "+ (i-1)+" "+(j-1));
24                    int next = 0;
25                    if(i<n){
26                        // System.out.println("dp1 "+ dp1[i]);
27                        next = dp1[i];
28                    }
29                    if(j<m){
30                        // System.out.println("dp2 "+ dp2[j]);
31                        next = Math.max(next, dp2[j]);
32                    }
33                    max = Math.max(max, (2*dp[i][j])+next);
34                }else{
35                    dp[i][j] = 0;
36                }
37            }
38        }
39        return max;
40        
41        // return len;
42    }
43
44    public int[] getDp(String s, boolean[][] palin){
45        int n = s.length();
46        int[] dp = new int[n];
47        Arrays.fill(dp, 1);
48        for(int i=0;i<n;i++){
49            int len = 1;
50            for(int j=i+1;j<n;j++){
51                if(palin[i][j]){
52                    len = Math.max(len, j-i+1);
53                }
54            }
55            dp[i] = len;
56            max = Math.max(max, len);
57        }
58        return dp;
59    }
60
61    public boolean[][] palinDp(String s){
62        int n = s.length();
63        boolean[][] isPalindrome = new boolean[n][n];
64        for(int i=0;i<n;i++){
65            isPalindrome[i][i] = true;
66            if(i<n-1){
67                if(s.charAt(i)==s.charAt(i+1)){
68                    isPalindrome[i][i+1] = true;
69                }
70            }
71        }
72        for(int k=3;k<=n;k++){
73            for(int i=0;i+k-1<n;i++){
74                if(isPalindrome[i+1][i+k-2] && s.charAt(i)==s.charAt(i+k-1)){
75                    isPalindrome[i][i+k-1]=true;
76                }
77            }
78        }
79        return isPalindrome;
80    }
81
82    public boolean isPalin(String s, int i, int j){
83        while(i<=j){
84            if(s.charAt(i)!=s.charAt(j)) return false;
85            i++; j--;
86        }
87        return true;
88    }
89    
90    public int longestCommonSubString(String s, String t){
91        int n = s.length();
92        int m = t.length();
93        int[][] dp = new int[n+1][m+1];
94        int max = 0;
95        for(int i=1;i<=n;i++){
96            for(int j=1;j<=m;j++){
97                if(s.charAt(i-1)==t.charAt(j-1)){
98                    dp[i][j] = dp[i-1][j-1]+1;
99                    max = Math.max(max, dp[i][j]);
100                }else{
101                    dp[i][j] = 0;
102                }
103            }
104        }
105        return max;
106    }
107}