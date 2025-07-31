// Last updated: 7/31/2025, 12:28:33 PM
class Solution {
    public int countNegatives(int[][] grid) {
        int count =0;
        for (int i=grid.length-1 ; i>=0  ; i--)   {
            int f=0;
            for(int j=grid[0].length-1; j>=0 ;j--){
                if (grid[i][j]<0){
                    count++;
                    f=1;
                }
                else{
                    break;
                }
                if(f==0){
                    break;
                }
            }
        }
        return count;
    }
    
}