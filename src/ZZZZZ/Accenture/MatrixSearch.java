package ZZZZZ.Accenture;

public class MatrixSearch {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,4},
                {7,8,9},
        };
        int n = 2;
        int m = 3;
        int target = 8;
        System.out.println(search(arr,n,m,target));
    }
    static  int search(int[][] arr, int n, int m, int target){
        int i = n-1;
        int j = m-1;

        while(i < j && j >= 0){
            if(arr[i][j] == target)
                return  1;
            else if(arr[i][j] > target)
                j--;
            else
                i++;
        }

        return -1;
    }
}
