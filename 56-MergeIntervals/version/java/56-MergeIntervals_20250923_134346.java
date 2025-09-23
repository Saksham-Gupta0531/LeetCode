// Last updated: 9/23/2025, 1:43:46 PM
class Solution {
    public int[][] merge(int[][] intervals) {
        int[][] arr = new int[intervals.length][2];
        if (intervals.length == 0) return arr;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        arr[0]=intervals[0];
        int i=1;
        int n=intervals.length;
        int x=0;
       // int flag=0;
        while ( i<n ){
            //flag=1;
            if (intervals[i][0]<=arr[x][1] && intervals[i][1]<=arr[x][1]){ i++;}
            else if (intervals[i][0] > arr[x][1]) {
                x++;
                arr[x] = intervals[i];
              
                i++;
               // flag=1;
            }
            else if(intervals[i][0]<=arr[x][1] && intervals[i][1]>=arr[x][1]){
                
                arr[x][1] = intervals[i][1];
                i++;
            
               // flag=1;
            }
            else {
                System.out.print("["+intervals[i][0]+"  "+intervals[i][1]+" ]");
                i++;
            }

        }
        

        return Arrays.copyOfRange(arr, 0, x+1);
    }
}