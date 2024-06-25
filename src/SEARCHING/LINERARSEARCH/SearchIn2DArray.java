package SEARCHING.LINERARSEARCH;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        int target = 8;
        System.out.println(search(arr,target));
    }
    static int search(int[][] arr, int target){
        for (int row = 0; row <arr.length ; row++) {
            for (int column = 0; column <arr.length ; column++) {
                if(arr[row][column] == target) return arr[row][column];
            }
        }
        return -1;
    }
}
