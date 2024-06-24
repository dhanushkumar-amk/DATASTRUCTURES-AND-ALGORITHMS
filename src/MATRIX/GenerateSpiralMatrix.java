package MATRIX;

public class GenerateSpiralMatrix {
    public static void main(String[] args) {
        int n = 3;
        int[][] result  =  generateMatrix(n);
        for (int i = 0; i <result.length ; i++) {
            for (int j = 0; j < result.length ; j++) {
                System.out.print(result[i][j]);
            }
        }

    }
    static int[][] generateMatrix(int n){
        int[][] spiralMatrix = new int[n][n];
        int top = 0;
        int left = 0;

        int Bottom = n - 1;
        int right = n - 1;

        int count = 1;
        int TotalCount = n * n;

        while (count <= TotalCount) {
            // Top row
            for (int i = left; count <= TotalCount && i <= right; i++) {
                spiralMatrix[top][i] = count++;
            }
            top++;

            // Rightmost column
            for (int i = top; count <= TotalCount && i <= Bottom; i++) {
                spiralMatrix[i][right] = count++;
            }
            right--;

            // Bottom row
            for (int i = right; count <= TotalCount && i >= left; i--) {
                spiralMatrix[Bottom][i] = count++;
            }
            Bottom--;

            // Leftmost column
            for (int i = Bottom; count <= TotalCount && i >= top; i--) {
                spiralMatrix[i][left] = count++;
            }
            left++;
        }

        return spiralMatrix;
    }
}