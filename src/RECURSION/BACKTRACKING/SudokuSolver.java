package RECURSION.BACKTRACKING;

public class SudokuSolver {

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

    public static void main(String[] args) {
        int[][] board = {
                {5,3,0,0,7,0,0,0,0},
                {6,0,0,1,9,5,0,0,0},
                {0,9,8,0,0,0,0,6,0},
                {8,0,0,0,6,0,0,0,3},
                {4,0,0,8,0,3,0,0,1},
                {7,0,0,0,2,0,0,0,6},
                {0,6,0,0,0,0,2,8,0},
                {0,0,0,4,1,9,0,0,5},
                {0,0,0,0,8,0,9,7,9}
        };

        System.out.println(solve(board));

        if (solve(board)) {
            Display(board);
        } else {
            System.out.println("Can't be solved");
        }
    }

    public static boolean solve(int[][] board) {
        int n = board.length;
        int row = -1;
        int column = -1;

        boolean emptyLeft = true;

        // Find the first empty cell
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    column = j;
                    emptyLeft = false;
                    break;
                }
            }
            if (!emptyLeft) {
                break;
            }
        }

        // If no empty cell is found, the puzzle is solved
        if (emptyLeft) {
            return true;
        }

        // Try placing numbers from 1 to 9 in the empty cell
        for (int number = 1; number <= 9; number++) {
            if (isSafe(board, row, column, number)) {
                board[row][column] = number;

                // Recursively attempt to solve the rest of the board
                if (solve(board)) {
                    return true;
                } else {
                    // Backtrack
                    board[row][column] = 0;
                }
            }
        }
        return false;
    }

    private static void Display(int[][] board) {
        for (int[] row : board) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(int[][] board, int row, int column, int num) {
        // Check the row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }

        // Check the column
        for (int[] nums : board) {
            if (nums[column] == num) {
                return false;
            }
        }

        // Check the 3x3 sub-grid
        int sqrt = (int) Math.sqrt(board.length);
        int rowStart = row - row % sqrt;
        int colStart = column - column % sqrt;

        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == num) {
                    return false;
                }
            }
        }
        return true;
    }
}
