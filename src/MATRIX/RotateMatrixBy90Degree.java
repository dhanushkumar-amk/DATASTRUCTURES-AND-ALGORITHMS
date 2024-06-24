package MATRIX;

public class RotateMatrixBy90Degree {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        RotateMatrix(matrix);
        System.out.println("Rotate Image");
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void RotateMatrix(int[][] matrix){
        // transpose matrix
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = i; j < matrix[0].length ; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // reverse the row in the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length/2 ; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 -j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
    }
}
