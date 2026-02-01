// Last updated: 2/1/2026, 11:32:10 PM
1class Solution {
2    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
3        int dp[][] = new int[endTime.length][2];
4        int mat[][] = new int[startTime.length][3];
5        for(int i=0; i<startTime.length; i++) {
6            mat[i][0] = startTime[i];
7            mat[i][1] = endTime[i];
8            mat[i][2] = profit[i];
9        }
10        Arrays.sort(mat,Comparator.comparingDouble(o->o[1]));
11        for(int i=0; i<mat.length; i++) {
12            int startT = mat[i][0];
13            int s = 0;
14            int e = i;
15            int mid = 0;
16            while(s<e) {
17              mid = (s+e)/2;
18              if(mat[mid][1]<=startT) {
19                  while(mid<mat.length && mat[mid][1]<=startT) {
20                      mid++;
21                  }
22                  mid--;
23                  break;
24              } else {
25                  e = mid;
26              }
27            }
28            if(mat[mid][1]<=startT) {
29              dp[i][0] = dp[mid][1]+mat[i][2];
30              dp[i][1] = Math.max(dp[i][0],dp[i-1][1]);
31            } else {
32                dp[i][0] = mat[i][2];
33            if(i>0) {
34              dp[i][1] = Math.max(dp[i][0],dp[i-1][1]);
35            }  else {
36                dp[i][1] = dp[i][0];
37            }
38          } 
39    }
40    return dp[mat.length-1][1];
41}
42}