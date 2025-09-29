// Last updated: 9/29/2025, 9:21:16 PM
class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(grid[i][j] == '1'){
                    search(grid, i , j);
                    count++; 
                }
                              
            }
        }
        return count;



    }
    public static void search(char[][] mtx, int i, int j){
        if(i < 0 || j < 0 || i == mtx.length || j == mtx[0].length) return;
        if(mtx[i][j] != '1') return;
        mtx[i][j] = '0';

        search(mtx, i-1, j);
        search(mtx, i, j - 1);
        search(mtx, i+1, j);
        search(mtx, i, j + 1);
     
    }

}