// Last updated: 2/4/2026, 12:29:21 PM
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i =0 ;i<mat.length ;i++){
            for(int j= 0 ;j<mat[0].length;j++){
                if(i==j || j==mat[0].length-i-1) sum+=mat[i][j];
            }
        }
        return sum;
    }
}