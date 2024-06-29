package SEARCHING.BINARYSEARCH;
import java.util.*;
public class SearchIn2DArray {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
        matrix.add(new ArrayList<>(Arrays.asList(5, 6, 7, 8)));
        matrix.add(new ArrayList<>(Arrays.asList(9, 10, 11, 12)));

        boolean result = searchMatrix(matrix, 81);
        System.out.println(result ? "true" : "false");
    }

    public static boolean searchMatrix(ArrayList<ArrayList<Integer>> matrix, int target){
        int n = matrix.size();
    int  m = matrix.get(0).size();


    int low = 0;
    int high = m*n-1;

    while(low <= high){
        int mid = (low + high)/2;
        int row = mid / m, col = mid % m;

        if(matrix.get(row).get(col) == target) return true;
        else if(matrix.get(row).get(col) > target)  high = mid -1;
        else low = mid + 1;
    }
    return false;
    }

}
