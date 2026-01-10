// Last updated: 1/10/2026, 5:57:26 PM
1class Solution {
2    public int eraseOverlapIntervals(int[][] intervals) {
3        int c =0;
4        Arrays.sort(intervals ,(a, b) ->  
5             a[1]-b[1]
6            
7        );
8        // for (int i = 0 ; i < intervals.length;i++ ){
9        //     System.out.print("["+intervals[i][0] +" "+  intervals[i][1]+"]");
10        // }
11        
12        int last=intervals[0][1];
13        for (int i= 1 ; i< intervals.length ;i++){
14
15            if (intervals[i][0]< last) {c++;}
16            else{last=intervals[i][1];}
17        }
18        return c;
19    }
20}