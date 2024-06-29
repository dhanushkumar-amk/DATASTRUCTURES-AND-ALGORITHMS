package SEARCHING.BINARYSEARCH;

import java.util.Arrays;

public class PeakElementIn2DArray {


    public static void main(String[] args) {
        int[][] mat = {
                {10,20,15},
                {21,30,14},
                {7,16,32},
        };

        int[] ans = findPeakGrid(mat);
        System.out.println(Arrays.toString(ans));
    }
        public static  int[] findPeakGrid(int[][] mat) {
            int n = mat.length;
            int m = mat[0].length;
            int low = 0;
            int high = m-1;
            while (low<=high) {
                int mid = (low+high)/2;
                int row = find_max_in_col(mat,n,mid);
                int left;
                int right;
                if (mid-1>=0) {
                    left = mat[row][mid-1];
                }
                else {
                    left = -1;
                }
                if (m>mid+1) {
                    right = mat[row][mid+1];
                }
                else {
                    right = -1;
                }
                if (left<mat[row][mid] && mat[row][mid]>right) {
                    return new int[] {row,mid};
                }
                else if(left>mat[row][mid]) {
                    high = mid-1;
                }
                else {
                    low = mid+1;
                }
            }
            return new int[] {-1,-1};
        }
        public static int find_max_in_col(int mat[][], int n, int col) {
            int idx = 0;
            int value = 0;
            for (int i=0; i<n; i++) {
                if (mat[i][col]>value) {
                    value = mat[i][col];
                    idx = i;
                }
            }
            return idx;
        }
    }


