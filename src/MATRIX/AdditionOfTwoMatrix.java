package MATRIX;

public class AdditionOfTwoMatrix {
    public static void main(String[] args) {
        int rows = 2, columns = 3;
        int[][] firstMatrix = { {2, 3, 4}, {5, 2, 3} };
        int[][] secondMatrix = { {-4, 5, 3}, {5, 6, 3} };

        int[][] sum = addition(matrix1, )
    }

    static int[][] addition(int[][] matrix1, int[][] matrix2, int row, int column){
        int[][] sum = new int[row][column];

        for (int i = 0; i <row ; i++) {
            for (int j = 0; j < column; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return  sum;
    }
}
