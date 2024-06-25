package SEARCHING.LINERARSEARCH;

public class SearchInRange {
    public static void main(String[] args) {
    int[] arr = {1,4,7,9,6,23,2,67};
    int target = 9;
    int start = 1;
    int end = 6;
        System.out.println(searchinRange(arr,target,start,end));

    }
    static int searchinRange(int[] arr, int target, int start, int end){
        for (int i = start; i <=end ; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

}
