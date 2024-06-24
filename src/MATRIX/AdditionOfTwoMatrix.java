package MATRIX;

public class AdditionOfTwoMatrix {
    public static void main(String[] args) {
        
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
