package RECURSION;

public class RotatedBinarysearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,1,2,3,4};
        int target = 7;
        System.out.println(bSearch(arr, target, 0, arr.length));
    }

    static  int bSearch(int[] arr, int target,int start, int end){
        if( start > end )
            return  -1;

        int mid = start + (end - start) / 2;

        if(arr[mid] == target)
            return mid;

        // case 1
        if(arr[start] <= arr[mid]){
            if(target >= arr[start] & target <= arr[mid])
               return bSearch(arr, target, start, mid -1);
            else
                 return  bSearch(arr, target, mid + 1, end);
        }
        else {
            if (target >= arr[mid] && target <= arr[end])
                return bSearch(arr, target, mid + 1, end);
            else
                return bSearch(arr, target, start, mid -1 );
        }
    }
}
