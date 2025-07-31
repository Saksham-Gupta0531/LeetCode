// Last updated: 7/31/2025, 12:30:09 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int i = 0; 
        int j = m-1;
        int cur = matrix[i][j];
        while(i < n && j >= 0){
            cur = matrix[i][j];
            if(cur < target){
                i++;
            }else if(cur > target){
                j--;
            }else{
                return true;
            }
        }return false;
    }
}