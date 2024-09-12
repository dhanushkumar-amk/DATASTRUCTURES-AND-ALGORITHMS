package RECURSION.MAZE_PROBLEMS;

public class CountPossiblePathsInMaze {
    public static void main(String[] args) {

        int row = 3;
        int column = 3;
        System.out.println(countPath(row, column));
    }
    static  int countPath(int row, int column){

        // base case
        if(row == 1 || column == 1)
            return 1;

        int left = countPath(row - 1, column);
        int right = countPath(row, column - 1);

        return right + left;
    }
}
