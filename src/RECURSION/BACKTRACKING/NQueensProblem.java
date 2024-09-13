package RECURSION.BACKTRACKING;



public class NQueensProblem {
    public static void main(String[] args) {

    }
    static  int queens(boolean[][] board, int row){
        if (row == board.length){
            Display(board);
            return 1;
        }
    }

    private static void Display(boolean[][] board) {
        for (boolean[] row : board){
            for (boolean element : row){
                if (element == true)
                    System.out.println("Q ");
                else
                    System.out.println("");
            }
        }
    }
}
