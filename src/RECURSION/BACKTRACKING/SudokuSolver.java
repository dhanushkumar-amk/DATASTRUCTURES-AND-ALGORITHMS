package RECURSION.BACKTRACKING;

public class SudokuSolver {
    public static void main(String[] args) {

        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'},
             };
        }

    public static void solveSudoku(char[][] board) {
        
        
        
    }
    
    static  boolean solve(int[][] board){
        
        int n  = board.length;
        int row = - 1;
        int column = -1;

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < ; j++) {
                
            }
        }
    }
    
    static  boolean isSafe(int[][] board, int row, int column, int num){
        // check the row
        // if there already a number is present in this number we can't put number so return false 
        for (int i = 0; i < board.length ; i++) {
            if (board[row][i] == num)
                return  false;
        }
        
        // for every column
        for(int[] nums : board){
            if (nums[column] == num)
                return false;
        }
        
        
        // for checking sub mtrix
        int sqrt = (int) (Math.sqrt(board.length));
        
//        sub matrix start column and row
        
        int rowStart = row - row % sqrt;
        int colStart = column - column % sqrt;

        for (int r = rowStart; r < rowStart + sqrt ; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] = num)
                    return  false;
            }
        }
        return  true;
    }
}
