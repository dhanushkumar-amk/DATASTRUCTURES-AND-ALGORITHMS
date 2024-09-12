package RECURSION.MAZE_PROBLEMS;

public class PrintPossiblePathsInMaze {
    public static void main(String[] args) {
        printPath("",3,3);
    }
    static  void printPath(String p, int row, int column){

        // base case
        if(row == 1 && column == 1){
            System.out.println(p);
            return;
        }

        if (row > 1 ){
            printPath(p + 'D', row - 1, column);
        }

        if (column > 1){
            printPath(p + 'R', row, column - 1);
        }

    }
}
