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

        print("", maze,0,0,path,1);

        }

        static  void print(String p, boolean[][] maze, int row, int column, int[][] path, int steps){

        if (row == maze.length - 1 && column ==maze[0].length - 1){

            for (int[] i : path)
                System.out.println(Arrays.toString(i));
            System.out.println();
        }

        if (maze[row][column] == false)
            return;
        else
            maze[row][column] = false;

        path[row][column] = steps;

            if (row < maze.length - 1)
                print(p + 'D', maze,row + 1,column,path,steps + 1);


            if (column < maze[0].length - 1)
                print(p + 'R', maze,row ,column + 1,path,steps + 1);


            if (row > 0 )
                print(p + 'U', maze,row - 1,column,path,steps + 1);

            if (column > 0)
                print(p + 'L', maze,row ,column - 1,path,steps + 1);

            maze[row][column] = true;
            path[row][column] = 0;

    }

}
