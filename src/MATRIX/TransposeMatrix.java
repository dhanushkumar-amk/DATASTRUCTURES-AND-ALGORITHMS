package MATRIX;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        //int[][] ans = transpose(matrix);
        System.out.println("Before transpose Matrix :");
        printMatrix(matrix);
        System.out.println("After transpose Matrix :");

     int[][] ans = transpose(matrix);
     printMatrix(ans);
    }

    public static  void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix.length ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int[][] matrix){
int[][]  result = new int[matrix.length][matrix.length];

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix.length ; j++) {
                result[j][i] = matrix[i][j];
            }
        }
return result;
    }
}
