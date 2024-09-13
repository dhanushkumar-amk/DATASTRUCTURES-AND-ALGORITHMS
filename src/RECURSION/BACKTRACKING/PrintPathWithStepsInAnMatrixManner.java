package RECURSION.BACKTRACKING;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintPathWithStepsInAnMatrixManner {
        public static void main(String[] args) {

        boolean[][] maze =  {
              {true, true, true},
            {true, true, true},
            {true, true, true},
            };

        int[][] path = new int[maze.length][maze[0].length];

//        print("", maze,0,0,path,1);
        print1("", maze,0,0,path,1);

        }

        static  void print(String p, boolean[][] maze, int row, int column, int[][] path, int steps){

        if (row == maze.length - 1 && column ==maze[0].length - 1){

            // the base condition is also a path
            path[row][column] = steps;
            for (int[] i : path)
                System.out.println(Arrays.toString(i));
            System.out.println(p);
            System.out.println();

        }

        if (!maze[row][column])
            return;

            maze[row][column] = false;
            path[row][column] = steps;

            if (row < maze.length - 1)
                print(p + 'D', maze,row + 1,column,path,steps + 1);


            if (column < maze[0].length - 1)
                print(p + 'R', maze,row ,column + 1,path,steps + 1);


            if (row > 0 )
                print(p + 'U', maze,row - 1, column ,path,steps + 1);

            if (column > 0)
                print(p + 'L', maze, row ,column - 1, path,steps + 1);

            // backtracking concepts
            maze[row][column] = true;
            //  make it as 0
            path[row][column] = 0;

    }



    static void print1(String p, boolean[][] maze, int row, int column, int[][] path, int steps) {
        // Check if the current position is out of bounds or not valid
        if (row < 0 || row >= maze.length || column < 0 || column >= maze[0].length || !maze[row][column]) {
            return;
        }

        // Check if we have reached the destination
        if (row == maze.length - 1 && column == maze[0].length - 1) {
            path[row][column] = steps;
            for (int[] i : path) {
                System.out.println(Arrays.toString(i));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        // Mark the cell as visited
        maze[row][column] = false;
        path[row][column] = steps;

        // Move Down
        if (row < maze.length - 1) {
            print1(p + 'D', maze, row + 1, column, path, steps + 1);
        }

        // Move Right
        if (column < maze[0].length - 1) {
            print1(p + 'R', maze, row, column + 1, path, steps + 1);
        }

        // Move Up
        if (row > 0) {
            print1(p + 'U', maze, row - 1, column, path, steps + 1);
        }

        // Move Left
        if (column > 0) {
            print1(p + 'L', maze, row, column - 1, path, steps + 1);
        }

        // Backtrack: Unmark the cell as visited and reset path
        maze[row][column] = true;
        path[row][column] = 0;
    }

}
