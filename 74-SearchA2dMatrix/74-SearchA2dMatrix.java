// Last updated: 9/4/2025, 6:15:10 AM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low=0;
        int high=matrix.length-1;
        int mid =0;
        while (low<=high){
        mid = (low+high)/2;
            if (matrix[mid][0]<=target && matrix[mid][matrix[mid].length-1]>=target){
                break;
            }
            else if(matrix[mid][0]<target)
                low = mid+1;
            else 
                high = mid-1;
        }
        if (low > high) {
            return false; 
        }
        int left =0;
        int right =matrix[0].length-1;
        while (left<=right){
            int med= (left+right )/2;
            if (matrix[mid][med]== target)
                return true;
            else if(matrix[mid][med]> target)
                right= med -1;
            else
                left = med+1 ;
        }
        return false;
    }
}