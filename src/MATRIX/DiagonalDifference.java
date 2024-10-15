package MATRIX;

public class DiagonalDifference {
    public static void main(String[] args) {

        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        System.out.println(difference(matrix));

    }

    public static int difference(int[][] matrix){
        int leftSum = 0;
        int rightSum = 0;

        int n = 3;

        for (int i = 0; i <n ; i++) {
            leftSum += matrix[i][i];
        }

        for (int i = 0; i < n; i++) {
            rightSum += matrix[i][n-1- i];
        }

        return  Math.abs(leftSum - rightSum);

    }


}
