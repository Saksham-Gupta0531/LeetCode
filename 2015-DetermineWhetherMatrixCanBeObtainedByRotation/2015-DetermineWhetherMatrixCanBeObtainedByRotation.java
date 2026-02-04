// Last updated: 2/4/2026, 12:28:52 PM
class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        rotate(mat);
        for(int i=0 ;i<4;i++ ){
            if (equal(mat,target)) return true;
            mat=rotate(mat);
        }
        return false;
    }
    public boolean equal(int[][]a,int[][]b){
        for (int i =0 ; i<a.length ;i++){
            for(int j=0 ;j<a.length ;j++){
                if (a[i][j]!=b[i][j]) return false;
            }
        }
        return true;
    }
    public int[][] rotate(int[][] matrix) {
        for (int i =0 ;i<matrix.length ;i++){
            for(int j=i+1 ;j<matrix[0].length; j++){
                int a= matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=a;

            }
        }
        for (int  i=0 ; i< matrix.length ;i++){
            int l=0 ;
            int s=matrix[0].length-1;
            while(l<s){
                int a=matrix[i][l];
                matrix[i][l]=matrix[i][s];
                matrix[i][s]=a;
                l++;
                s--;
            }
        }
        return matrix;
        
    }
}