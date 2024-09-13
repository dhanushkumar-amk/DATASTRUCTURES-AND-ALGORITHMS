package RECURSION.MAZE_PROBLEMS;

import java.util.ArrayList;

public class PrintPathWithDiagonals {
    public static void main(String[] args) {
        System.out.println(path("", 3,3));
    }
    static ArrayList<String> path(String p, int row, int column){

        // base case
        if (row == 1 && column == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (row > 1 && column > 1)
            list.addAll(path(p + 'D', row - 1, column - 1));

        if (row > 1)
            list.addAll(path(p + 'D', row -1, column));

        if (column > 1)
            list.addAll(path( p + 'R', row, column - 1));

        return list;
    }
}
