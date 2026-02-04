// Last updated: 2/4/2026, 12:30:56 PM
class Solution {
    public int[][] floodFill(int[][] images, int sr, int sc, int color) {
        // System.out.print(images[0][0]);
        search(images , sr,sc ,color,images[sr][sc]);
        // System.out.print(images[0][0]);
        return images;
    }
     public static void search(int[][] mtx, int i, int j, int color,int k){
        if(i < 0 || j < 0 || i == mtx.length || j == mtx[0].length) return;
        if(mtx[i][j] != k) return;
        if(mtx[i][j]==color) return;
        mtx[i][j] = color;
        

        search(mtx, i-1, j,color,k);
        search(mtx, i, j - 1,color,k);
        search(mtx, i+1, j,color,k);
        search(mtx, i, j + 1,color,k);
        return ;
     
    }

}