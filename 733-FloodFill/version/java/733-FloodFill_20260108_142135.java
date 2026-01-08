// Last updated: 1/8/2026, 2:21:35 PM
1class Solution {
2    public int[][] floodFill(int[][] images, int sr, int sc, int color) {
3        // System.out.print(images[0][0]);
4        search(images , sr,sc ,color,images[sr][sc]);
5        // System.out.print(images[0][0]);
6        return images;
7    }
8     public static void search(int[][] mtx, int i, int j, int color,int k){
9        if(i < 0 || j < 0 || i == mtx.length || j == mtx[0].length) return;
10        if(mtx[i][j] != k) return;
11        if(mtx[i][j]==color) return;
12        mtx[i][j] = color;
13        
14
15        search(mtx, i-1, j,color,k);
16        search(mtx, i, j - 1,color,k);
17        search(mtx, i+1, j,color,k);
18        search(mtx, i, j + 1,color,k);
19        return ;
20     
21    }
22
23}