package SEARCHING.BINARYSEARCH;

public class FindHowManyTimesArrayHasBeenRotated {
    public static int findMin(int []arr) {
        int low = 0, high = arr.length - 1;
        int ans = Integer.MAX_VALUE;
        int index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;

            //search space is already sorted
            //then arr[low] will always be
            //the minimum in that search space:
            if (arr[low] <= arr[high]) {
            if(arr[low] < ans){
            index = low;
                ans = arr[low];
            }
                break;
            }

            //if left part is sorted:
            if (arr[low] <= arr[mid]) {


                if(arr[low] < ans){
                index = low;
                    ans = arr[low];
                }

                // Eliminate left half:
                low = mid + 1;

            } else {
                if(arr[mid] < ans){
                    index =

                    ans = arr[mid];
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        int ans = findMin(arr);
        System.out.println("The minimum element is: " + ans );
    }

}
