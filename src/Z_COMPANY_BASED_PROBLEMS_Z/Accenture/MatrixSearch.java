package Z_COMPANY_BASED_PROBLEMS_Z.Accenture;

public class MatrixSearch {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 4},
                {7, 8, 9},
        };
        int n = 2;
        int m = 3;
        int target = 8;
        System.out.println(search(arr, n, m, target));
    }

    static int search(int[][] arr, int n, int m, int target) {
        int i = n - 1;
        int j = 0;

        while (i >= 0 && j < m) {
            if (arr[i][j] == target)
                return 1;
            else if (arr[i][j] > target)
                i--;
            else
                j++;
        }

        return -1;
    }
}
