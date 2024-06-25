package SEARCHING.LINERARSEARCH;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        int target = 18;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target){
        for (int row = 0; row <arr.length ; row++) {
            for (int column = 0; column <arr.length ; column++) {
                if(arr[row][column] == target) return new int[]{row,column} ;
            }
        }
        return new int[]{-1,-1};
    }
}
