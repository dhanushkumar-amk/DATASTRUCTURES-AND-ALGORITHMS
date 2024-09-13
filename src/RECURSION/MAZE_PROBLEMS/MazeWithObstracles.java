package RECURSION.MAZE_PROBLEMS;

public class MazeWithObstracles {
    public static void main(String[] args) {

        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true},
        };

        path("", maze,0,0);
    }
    static void path(String p, boolean[][] maze, int row, int column){

        // base case
        if (row == maze.length - 1 && column == maze[0].length - 1){
            System.out.println(p);
            return;
        }

        if (maze[row][column] == false)
            return;


        path( p + 'D', maze, row + 1, column);
        path(p + 'R', maze, row, column + 1);


    }

}
