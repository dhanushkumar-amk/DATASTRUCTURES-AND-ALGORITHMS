package RECURSION.BACKTRACKING;

public class SudokuSolver {
    public static void main(String[] args) {


        /*
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

         */

        int[][]  board = {
                {5,3,0,0,7,0,0,0,0},
                {6,0,0,1,9,5,0,0,0},
                {0,9,8,0,0,0,0,6,0},
                {8,0,0,0,6,0,0,0,3},
                {4,0,0,8,9,3,0,0,1},
                {7,0,0,0,2,0,0,0,6},
                {0,6,0,0,0,0,2,8,0},
                {0,0,0,4,1,9,0,0,5},
                {0,0,0,0,8,0,0,7,9},
            };
        System.out.println(solve(board));

        if (solve(board))
            Display(board);

        else
            System.out.println("Can't be solve");
    }

    public static void solveSudoku(char[][] board) {




    }

    static  boolean solve(int[][] board){

        int n  = board.length;
        int row = - 1;
        int column = -1;

        boolean emptyLeft = true;

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {
                if (board[i][j] == 0){
                    row = i;
                    column = j;
                    emptyLeft = false;
                    break;
                }
            }
            // if you found  some empty element in row then break;
        if (emptyLeft == false)
            break;
        }

        if (emptyLeft == true)
            return true;

        for (int number = 1; number <= 9 ; number++) {
            if (isSafe(board, row, column,number)){
                board[row][column] = number;

                if ( solve(board)) {
                    return true;
                }
                else
                    board[row][column] = 0;
            }
        }
        return  false;
    }

    private static  void  Display(int[][] board){
        for (int[] row : board){
            for (int num : row){
                System.out.println(num + "  ");
            }
            System.out.println();
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
                    return  ;
            }
        }
        return  true;
    }
}
