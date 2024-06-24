package MATRIX;

public class GenerateSpiralMatrix {
    public static void main(String[] args) {

    }
    static int[][] generateMatrix(int n){
        
        int[][] spiralMatrix = new int[n][n];

        int top = 0;
        int left= 0;
        int bottom = n-1;
        int right = n-1;

        int count = 1;
        int totalCount = n*n;
        while(count <= totalCount)
        {
            for (int i = top; i <= left && count <= totalCount; i++) {
                spiralMatrix[top][i] = count++;
            }
            top++;

            for (int i = right; i <= bottom && count <= totalCount ; i++) {
                spiralMatrix[i][right] = count++;
            }
            right--;

            for (int i =right ; i <= left && count <= totalCount ; i--) {
                spiralMatrix[bottom][i] =count++;
            }
            bottom++;

            for (int i = bottom; i < top && count <= totalCount; i--) {
                spiralMatrix[i][left] = count++;
            }
        }
        return  spiralMatrix;
    }
}



class Solution {
    static int[][] generateMatrix(int n) {
        int[][] spiralMatrix = new int[n][n];
        int startingRow = 0;
        int startingCol = 0;

        int endingRow = n - 1;
        int endingCol = n - 1;

        int count = 1;
        int totalcount = n * n;

        while (count <= totalcount) {
            // Top row
            for (int index = startingCol; count <= totalcount && index <= endingCol; index++) {
                spiralMatrix[startingRow][index] = count++;
            }
            startingRow++;

            // Rightmost column
            for (int index = startingRow; count <= totalcount && index <= endingRow; index++) {
                spiralMatrix[index][endingCol] = count++;
            }
            endingCol--;

            // Bottom row
            for (int index = endingCol; count <= totalcount && index >= startingCol; index--) {
                spiralMatrix[endingRow][index] = count++;
            }
            endingRow--;

            // Leftmost column
            for (int index = endingRow; count <= totalcount && index >= startingRow; index--) {
                spiralMatrix[index][startingCol] = count++;
            }
            startingCol++;
        }

        return spiralMatrix;
    }
}
