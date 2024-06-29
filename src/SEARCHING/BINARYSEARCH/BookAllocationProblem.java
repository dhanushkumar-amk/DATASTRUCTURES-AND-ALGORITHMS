package SEARCHING.BINARYSEARCH;

public class BookAllocationProblem {

    public static void main(String[] args) {
        int[] arr = {12,344,67,90};
        int b= 2;
        System.out.println(maxPage(arr, b));
    }

    static boolean ispossibleSolution(int[] arr, int b, int mid){
        int student = 1;
        int studentPageCount = 0;
        for (int i = 0; i <arr.length ; i++) {

            // base condition
            if(arr[i] > mid) return false;


            if(studentPageCount +arr[i] <= mid) studentPageCount += arr[i];
            else {
                student++;
           if(student > b) return false;
            }
            studentPageCount = arr[i];
        }
        return true;
    }


    static int maxPage(int[] arr, int b){

        // base condition
        if(arr.length < b) return -1;

        // find low and high
        int low = arr[0];
        int high = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] < low) low = arr[i];
            high += arr[i];
        }

        int res = -1;
        while(low <= high){
            int mid = (low + high)/2;
        if(ispossibleSolution(arr, b, mid) == true){
            res = mid;
            high = mid - 1;
        }else{
            low = mid + 1;
          }
        }
        return  res;
    }
}
