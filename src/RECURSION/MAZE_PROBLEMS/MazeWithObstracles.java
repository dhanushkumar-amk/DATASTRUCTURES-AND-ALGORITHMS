package RECURSION.MAZE_PROBLEMS;

public class MazeWithObstracles {
    public static void main(String[] args) {

        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true},
        };

        path("", maze,2,2);
    }
    static void path(String p, boolean[][] maze, int row, int column){

        // base case
        if (row == 0 && column == 0){
            System.out.println(p);
            return;
        }

        if (!maze[row][column])
            return;


        if ( row <= 0)
          path( p + 'U', maze, row , column - 1);

        if (column <= 0)
          path(p + 'L', maze, row - 1, column);


    }

}
