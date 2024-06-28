package SEARCHING.BINARYSEARCH;

public class MinimumNumberOfdaysToMakeMBouquets {

    static  boolean isPossibleSolution(int[] arr, int boq, int flowers, int mid){
        int adj = 0;
        int bcount = 0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] <= mid) {
                adj++;
                if(adj == flowers){
                    bcount++;
                    if(bcount == boq){
                        return  true;
                    }
                    adj = 0;
                }
            }
            else{
                adj = 0;
            }
        }
        return  false;
    }

    static int midDayBoutquets(int[] arr, int boq, int flowers ){
        int res = -1;

        if(boq * flowers > arr.length)  return -1;

        int low =arr[0];
        int high = arr[0];

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] < low)low = arr[i];

            if(arr[i] > high) high = arr[i];

        }

        while(low <= high){
            int mid = (low + high)/2;
            if(isPossibleSolution(arr, boq,flowers, mid) == true){
                res = mid;
                high = mid -1;
            }
            else {
                low = mid + 1;
            }
        }
        return res;
    }


}
