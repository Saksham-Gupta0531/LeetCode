// Last updated: 9/8/2025, 11:49:27 PM
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat.length == 0) {
            return new int[0];
        } else {
            int n = mat.length;
            int m = mat[0].length;

            int[] result = new int[m * n];
            int index = 0; // to fill result array

            int row, col;
            for (int i = 0; i < m + n - 1; i++) {
                List<Integer> diagonal = new ArrayList<>();

                // starting point of each diagonal
                if (i < m) {
                    row = 0;
                    col = i;
                } else {
                    row = i - m + 1;
                    col = m - 1;
                }

                // collect elements in the diagonal
                while (row < n && col >= 0) {
                    diagonal.add(mat[row][col]);
                    row++;
                    col--;
                }

                // reverse alternate diagonals
                if (i % 2 == 0) {
                    Collections.reverse(diagonal);
                }

                // add to result
                for (int num : diagonal) {
                    result[index++] = num;
                }
            }
            return result;
        }
    }
}
