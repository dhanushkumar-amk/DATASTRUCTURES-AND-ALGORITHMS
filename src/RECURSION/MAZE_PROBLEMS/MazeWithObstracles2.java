package RECURSION.MAZE_PROBLEMS;

public class MazeWithObstracles2 {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true},
        };

        path("", maze, 0, 0);
    }

    private static void path(String p, boolean[][] maze, int row, int column) {
        // base case
        if (row == maze.length - 1 && column == maze[0].length - 1)
        {
            System.out.println(p);
            return;
        }

        if (!maze[row][column])  // if(maze[row][column] == false)
            return;  // if maze is become false just return

        if (row < maze.length - 1)
            path(p + 'D', maze, row + 1, column);

        if (column < maze[0].length - 1)
            path(p + 'R', maze, row, column - 1);
        

    }


}
