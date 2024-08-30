package RECURSION;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,3,6,3,45,8};
        int target = 45;
        System.out.println(linerarSearch(arr, target, 0));
        System.out.println(findIndex(arr, target, 0));
    }
    static boolean linerarSearch(int[] arr, int target, int index){

        // base case
        if( index == arr.length)
            return false;

        // recursive case
        return  arr[index] == target || linerarSearch(arr,target, index + 1);
    }
    static  int findIndex(int[] arr, int target, int index){
        if(index == arr.length)
            return  -1;

        if(index == target)
            return  index;
        else
            return findIndex(arr, target, index + 1);
    }
}
