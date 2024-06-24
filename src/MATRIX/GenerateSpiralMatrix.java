package MATRIX;

public class GenerateSpiralMatrix {
    public static void main(String[] args) {

    }
    static int[][] generateMatrix(int n){

        int[][] spiralMatrix = new int[n][n];

        int top = 0;
        int left = 0;

        int Bottom = n - 1;
        int bottom = n - 1;

        int count = 1;
        int TotalCount = n * n;

        while (count <= TotalCount) {
            // Top row
            for (int i = left; count <= TotalCount && i <= bottom; i++) {
                spiralMatrix[top][i] = count++;
            }
            top++;

            // Rightmost column
            for (int i = top; count <= TotalCount && i <= Bottom; i++) {
                spiralMatrix[i][bottom] = count++;
            }
            bottom--;

            // Bottom row
            for (int i = bottom; count <= TotalCount && i >= left; i--) {
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