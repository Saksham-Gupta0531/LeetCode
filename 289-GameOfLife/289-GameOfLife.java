// Last updated: 9/4/2025, 6:14:08 AM
class Solution {
    public void gameOfLife(int[][] board) {
        int[][] dup = new int[board.length][board[0].length];
        for(int i=0 ;i<board.length;i++){
            for (int j=0; j<board[0].length ;j++){
                int live=0;
                if (i+1 < board.length && board[i+1][j] == 1)
                    live++;
                if (j+1 < board[0].length && board[i][j+1] == 1) 
                    live++;
                if (i+1 < board.length && j+1 < board[0].length && board[i+1][j+1] == 1)         
                    live++;
                if (i-1 >= 0 && j-1 >= 0 && board[i-1][j-1] == 1) 
                    live++;
                if (j-1 >= 0 && board[i][j-1] == 1) 
                    live++;
                if (i-1 >= 0 && board[i-1][j] == 1) 
                    live++;
                if (i+1 < board.length && j-1 >= 0 && board[i+1][j-1] == 1) 
                    live++;
                if (i-1 >= 0 && j+1 < board[0].length && board[i-1][j+1] == 1) 
                    live++;
                
                if (board[i][j] == 1) { 
                    if (live < 2 || live > 3) {
                        dup[i][j] = 0; 
                    } else {
                        dup[i][j] = 1;
                    }
                } else { 
                    if (live == 3) {
                        dup[i][j] = 1; 
                    }
                } 
            }
        }
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                board[i][j] = dup[i][j];
            }
        }
    }
}