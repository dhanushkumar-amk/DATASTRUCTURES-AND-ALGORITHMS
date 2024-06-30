package SEARCHING.BINARYSEARCH;

public class MedianOfTheMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {5, 11, 20, 35, 45},
                {1,2,3,4,5},
                {13,15,16,19,21},
        };
        int median = findMedian(matrix);
        System.out.println(median);
    }

    static int findMedian(int[][] matrix){

        // init min and max value first value
        int min = matrix[0][0];
        int max = matrix[0][0];
        int medianPosition = (matrix.length * matrix[0].length + 1)/2;
        // find min and max value
        for (int i = 0; i <matrix.length ; i++) {
            if(matrix[i][0] < min) min = matrix[i][0];
            if(matrix[i][matrix[0].length-1] > max) max = matrix[i][matrix[0].length-1];
        }

        // binary search
        while(min < max){
            int mid = (min + max)/2;
            int count = 0;
            for (int i = 0; i <matrix.length ; i++) {
                int temp = findCount(matrix[i], mid);
                count += temp;
            }

            if(count < medianPosition) min = mid + 1;
            else max = mid;
        }
        return min;
    }


    static int findCount(int[] arr, int mid){
        int count = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] <= mid) count++;
            else break;
        }
        return  count;

    }
}
