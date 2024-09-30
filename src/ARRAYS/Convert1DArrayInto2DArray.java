package ARRAYS;

// leetcode 2022

public class Convert1DArrayInto2DArray {
    public static void main(String[] args) {
int[] original = {1,2,3,4,5,6};

int[][] res = construct2DArray(original, 3, 3);

        for (int i = 0; i < res.length ; i++) {
            for (int j = 0; j <res[0].length ; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] construct2DArray(int[] original, int m, int n) {

        if(m * n != original.length)
            return new int[][]{};

        int row = 0;
        int col = 0;
        int IndexInOrginalArray = 0;

        int[][] ans =new int[m][n];

        while(row < m){
            col = 0;
            while(col < n){
                ans[row][col] = original[IndexInOrginalArray++];
                col++;
            }
            row++;
        }
        return ans;
    }

}
