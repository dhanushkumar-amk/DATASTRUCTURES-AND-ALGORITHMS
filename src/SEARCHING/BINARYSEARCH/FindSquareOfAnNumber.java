package SEARCHING.BINARYSEARCH;

public class FindSquareOfAnNumber {

    public static void main(String[] args) {
        int n = 5;
        int ans = floorSqrt(n);
        System.out.println(ans);
    }
     public static int floorSqrt(int n) {

    // iif the n is 0 or 1
    if(n==1 || n == 0) return n;

    int low = 1;
        int high = n;
        int ans = 0;

        while (low <= high){
        int mid = (low + high)/2;

        if(mid * mid == n){
            return mid;
        }
        else if(mid * mid > n){
            low = mid + 1;
            ans = mid;
        }
        else{
            high = mid - 1;
            }
        }
         return ans;
    }
}
