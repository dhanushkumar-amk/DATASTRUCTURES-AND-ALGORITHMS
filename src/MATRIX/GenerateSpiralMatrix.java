package MATRIX;

public class GenerateSpiralMatrix {

}

import java.util.Arrays;

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
