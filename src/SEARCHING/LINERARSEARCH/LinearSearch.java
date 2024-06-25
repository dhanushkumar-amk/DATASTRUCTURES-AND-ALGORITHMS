package SEARCHING.LINERARSEARCH;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,46,7,6};
        int target = 46;
        System.out.println(linearSearch(arr, target));
    }
        public static int linearSearch(int[] arr, int target){

            for (int i = 0; i <arr.length ; i++) {
                if(arr[i] == target){
                    return  i;
                }
            }
            return -1;
    }
}
