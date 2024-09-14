package RECURSION.BACKTRACKING;

public class NKnightsProblem {
    public static void main(String[] args) {

    }
    static  void knight(boolean[][] board, int row, int column, int knightCount){

        // base case
     if (knightCount == 0){
         Display(board);
         System.out.println();

        }

     // if one column reaches the end then go to the next row and start with column 0
     if (column == board.length)
         knight(board, row + 1, 0, knightCount);

     // if that current cell is safe ten place the knight and decrease knightCount by 1 and check the next column again place it as true and backtrack again

     if (isSafe(board, row, column)){
         board[row][column] = true;
         knight(board, row, column + 1, knightCount - 1);
         // then backtrack and check
         board[row][column] = false;
     }

    }

    private static void Display(boolean[][] board) {
        for (boolean[] row : board){
            for (boolean element : row){
//                if (element == true)
                if (element)
                    System.out.print("Q ");
                else
                    System.out.print("X ");
            }
            System.out.println();
        }
    }
}
