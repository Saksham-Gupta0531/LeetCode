// Last updated: 12/30/2025, 11:15:54 PM
1class Solution {
2    public int findJudge(int n, int[][] trust) {
3        HashSet<Integer> set = new HashSet<>();
4        
5        for(int i =0 ;i < trust.length ;i++){
6            set.add(trust[i][0]);
7        }
8    
9        if (set.size()!=n-1) return -1;
10
11        int sum = n*(n+1)/2;
12        for(int x: set){
13            sum =sum-x;
14        }
15        int j= sum ;
16        int c= 0 ;
17        for(int i = 0 ; i<trust.length ;i++){
18            if (j == trust[i][1]) c++;
19        }
20        if (c == n-1){
21            return j;
22        }
23        return -1;
24    }
25}