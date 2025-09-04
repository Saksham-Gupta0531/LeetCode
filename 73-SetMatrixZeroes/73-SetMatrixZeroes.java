// Last updated: 9/4/2025, 6:15:12 AM
class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> row= new ArrayList<>();
        ArrayList<Integer> col= new ArrayList<>();
        for(int i=0 ; i< matrix.length;i++){
            for(int j=0 ; j< matrix[0].length ;j++){

                if (matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }

        }
        for(int i=0 ; i< matrix.length;i++){
            for(int j=0 ; j< matrix[0].length ;j++){
                if (col.contains(j) || row.contains(i)){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
