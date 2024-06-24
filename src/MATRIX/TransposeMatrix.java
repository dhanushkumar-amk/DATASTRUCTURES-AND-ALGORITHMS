package MATRIX;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        //int[][] ans = transpose(matrix);
        //System.out.println();
        printMatrix(matrix);
    }

    public static  void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix.length ; j++) {
                System.out.print(matrix[i] + " ");
            }
            System.out.println();
        }
    }

    public static void transpose(int[][] matrix){


    }
}
