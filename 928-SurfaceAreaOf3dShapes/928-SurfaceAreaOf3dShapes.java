// Last updated: 7/31/2025, 12:28:48 PM
class Solution {
    public int surfaceArea(int[][] grid) {
        int total = 0;
        int n = grid.length;
        for(int i =0; i<n; i++)
{
    for(int j =0; j<n; j++)
    {
        if(grid[i][j]>0)
            total += 6*grid[i][j]-2*(grid[i][j]-1); //Surface Area of 1 cube: 6*grid[i][j]; Common Surface Area of vertically placed cubes:2*(grid[i][j]-1)
        
        if(i>0)
            total-= 2*Math.min(grid[i-1][j],grid[i][j]);//Hidden common vertical surface area
        
        if(j>0)
            total-= 2*Math.min(grid[i][j-1],grid[i][j]);//Hidden common horizontal surface area
    }
}
return total;
    }
}