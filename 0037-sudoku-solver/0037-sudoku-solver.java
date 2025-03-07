class Solution {
    public void solveSudoku(char[][] board) {
        isValid(board , 0 , 0);
    }

    private boolean isValid(char[][] board , int row , int col){
        if(row == board.length){
            return true;
        }
        
        int nrow = 0;
        int ncols = 0;

        if(col == board.length - 1){
            nrow = row + 1;
            ncols = 0;
        }
        else{
            nrow = row;
            ncols = col + 1;
        }

        if(board[row][col] != '.'){
                return isValid(board , nrow , ncols);
        }
            for(int i = 1 ; i <= 9 ; i++){
            if(isSafe(board , row , col , i)){
                board[row][col] = (char)(i + '0');
                    if(isValid(board , nrow , ncols)){
                        return true;
                    }
                    board[row][col] = '.';
                }
            }
        return false;    
    }
        
    private boolean isSafe(char[][] board , int row , int col , int num){
        for(int i = 0 ; i < board.length ; i++){
            if(board[i][col] == (char)(num + '0')){
                return false;
            }
        }

        for(int i = 0 ; i< board.length ; i++){
            if(board[row][i] == (char)(num + '0')){
                return false;
            }
        }

        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for(int i = sr ; i < sr + 3 ; i++){
            for(int j = sc ; j < sc + 3 ; j++){
                if(board[i][j] ==(char)(num + '0')){
                    return false;
                }
            }
        }
        return true;
    }
}