package SEARCHING.BINARYSEARCH;

public class PaintersPartions {
    public static void main(String[] args) {
int[] arr = {10,20,30,40};
int a = 2;
int b = 2;
        System.out.println(maxTime(arr, a,b));
    }
    static boolean isPossible(int[] arr, int a, int mid){
        int painters = 1;
        int pbc = 0;

        for (int i = 0; i <arr.length; i++) {
            if(arr[i] > mid) return false;

            if(pbc + arr[i] <= mid) {
                pbc += arr[i];
            }
            else {
                painters++;
                if(painters > a) {
                    return false;
                }
           pbc = arr[i];
            }
        }
        return true;

    }

    static  int maxTime(int[]arr, int a, int b){

        int low = 0;
        int high = 0;

        for (int i = 0; i <arr.length ; i++) {
            high += arr[i];
        }
        int res = -1;
        while(low <= high){
            int mid = low + (high - low)/2;

            if(isPossible(arr, a,mid)){
                res = mid;
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
    return   res * b;
    }

}
