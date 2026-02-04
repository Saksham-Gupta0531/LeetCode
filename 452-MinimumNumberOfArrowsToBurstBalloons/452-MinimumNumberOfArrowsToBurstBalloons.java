// Last updated: 2/4/2026, 12:31:55 PM
class Solution {
    public int findMinArrowShots(int[][] points) {
       Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int c= 1;
        int last_arrow = points[0][1];
        for (int i = 0 ; i < points.length ; i++){
            
            if (points[i][0]>last_arrow){
                c++;
                last_arrow =points[i][1];
            }
        }
        return c;
        
    }
}