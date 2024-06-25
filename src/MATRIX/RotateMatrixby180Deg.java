package MATRIX;

public class RotateMatrixby180Deg {
    public static void main(String[] args) {
int n = 3;
        int[][] matrix = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };

        rotate(matrix, n);
    }
    public static void rotate(int[][] matrix, int n) {
        for (int i = n-1; i >= 0 ; i--) {
            for (int j = n-1; j >=0 ; j--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

