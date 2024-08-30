package RECURSION;

public class ArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5};
        System.out.println(ArrayIsSorted(arr, 0));
    }
    static  boolean ArrayIsSorted(int[] arr, int index){

        // base case
        if( index == arr.length -1 )
            return  true;

        // recursive case
        return arr[index] < arr[index + 1] && ArrayIsSorted(arr, index + 1);

    }
}
