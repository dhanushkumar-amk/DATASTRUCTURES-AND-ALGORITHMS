package RECURSION.BACKTRACKING;

import java.util.ArrayList;

public class PrintAllPathInMaze {
    public static void main(String[] args) {

        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };

//        path("", maze, 0, 0);
        System.out.println(path("", maze, 0, 0));
    }

    public static ArrayList<String> path(String p, boolean[][] maze, int row, int column) {
        if (row == maze.length - 1 && column == maze[0].length - 1)
        {
            ArrayList<String> list = new ArrayList<>();
//            System.out.println(p);
            list.add(p);
//            return;

            return list;
        }


        ArrayList<String> list  = new ArrayList<>();
        if (maze[row][column] == false)
            return list;
//            return ;

        // if the path is not false then it is my path so i will changes it to false
        maze[row][column] = false;

        // for moving down
        if (row < maze.length - 1)
            list.addAll(path(p + 'D',maze, row + 1, column));

        // for moving right
        if (column < maze[0].length - 1)
            list.addAll(path(p + 'R', maze, row, column + 1));

        // for moving up
        if (row > 0)
            list.addAll(path(p + 'U', maze, row - 1,column));

        // for moving left
        if (column > 0)
            list.addAll(path(p + 'L', maze, row, column - 1));

        // here before ethe function moves the we will changes into back normal state
        // here the place were functions are over
        maze[row][column] = true;

        return list;
    }
}
