// Last updated: 1/10/2026, 5:54:08 PM
1class Solution {
2    public int eraseOverlapIntervals(int[][] intervals) {
3        Arrays.sort(intervals ,(a,b)->a[1]-b[1]);
4        int c= 0;
5        int last=intervals[0][1];
6        for(int i =1 ; i<intervals.length ;i++){
7            if ( intervals[i][0]<last){
8                c++;
9            }
10            else{
11                last = intervals[i][1];
12            }
13        }
14        return c;
15    }
16}