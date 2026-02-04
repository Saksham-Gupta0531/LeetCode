// Last updated: 2/4/2026, 12:32:00 PM
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int c =0;
        Arrays.sort(intervals ,(a, b) ->  
             a[1]-b[1]
            
        );
        // for (int i = 0 ; i < intervals.length;i++ ){
        //     System.out.print("["+intervals[i][0] +" "+  intervals[i][1]+"]");
        // }
        
        int last=intervals[0][1];
        for (int i= 1 ; i< intervals.length ;i++){

            if (intervals[i][0]< last) {c++;}
            else{last=intervals[i][1];}
        }
        return c;
    }
}