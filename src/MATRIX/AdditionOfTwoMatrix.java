package MATRIX;

public class AdditionOfTwoMatrix {
    public static void main(String[] args) {
        int rows = 2, columns = 3;
        int[][] firstMatrix = { {2, 3, 4}, {5, 2, 3} };
        int[][] secondMatrix = { {-4, 5, 3}, {5, 6, 3} };
        System.out.println("Sum of two matrices is: ");
       int[][] sum = additon(firstMatrix,secondMatrix,rows,columns);
        for (int i = 0; i <sum.length; i++) {
            for (int j = 0; j <sum[0].length ; j++) {
              System.out.print(sum[i][j] + "    ");
            }
            System.out.println();
        }
    }
    static int[][] additon(int[][] firstMatrix, int[][] secondMatrix, int rows, int columns){
      int[][] sum = new int[rows][columns];
        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j <columns ; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        return sum;
    }
}
