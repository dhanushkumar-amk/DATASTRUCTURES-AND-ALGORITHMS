package MATRIX;

public class MultiplicationOfMatrix {
    public static void main(String[] args) {

        int[][] a = {
                {2, 3},
                {4, 5},
        };
        int[][] b = {
                {1, 2, 3},
                {4, 5, 6},
        };

        int[][] c = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("The result Matrix is : ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
