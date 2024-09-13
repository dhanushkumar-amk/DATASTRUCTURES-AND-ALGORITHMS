package RECURSION.BACKTRACKING;

public class PrintAllPathInMaze {
    public static void main(String[] args) {

        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };

        path("", maze, 2, 2);
    }

    private static void path(String p, boolean[][] maze, int row, int column) {
        if (row == maze.length - 1 && column == maze[0].length - 1)
        {
            System.out.println(p);
            return;
        }

        if (maze[row][column] == false)
            return;

        // if the path is not false then it is my path so i will changes it to false
        maze[row][column] = false;

        // for moving down
        if (row < maze.length - 1)
            path(p + 'D',maze, row + 1, column);

        // for moving right
        if (column < maze[0].length - 1)
            path(p + 'R', maze, row, column + 1);

        // for moving up
        if (row > 0)
            path(p + 'U', maze, row - 1,column);

        // for moving left
        if (column > 0)
            path(p + 'L', maze, row, column - 1);

        // here before ethe function moves the we will changes into back normal state
        // here the place were functions are over
        maze[row][column] = true;
    }
}
