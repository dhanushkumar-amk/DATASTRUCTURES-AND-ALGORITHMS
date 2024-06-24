package MATRIX;

public class MultiplicationOfMatrix {
    public static void main(String[] args) {

        int[][] a = {{2,3},
                {4,5},
        };
        int[][] b = {{1,2,3},
                {4,5,6},
        };

        int[][] c  = new int[a.length][b[0].length];
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <b[0].length ; j++) {
                for (int k = 0; k < a[0].length ; k++) {
                    c[i][j] = c[j][j] + a[i][k]* b[k][j];
                }
            }
        }

        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <b[0].length ; j++) {
                System.out.println("the result Matrix is : ");
                System.out.print(c[i][j] + " ");
            }
        }
    }
}
