package RECURSION;

public class LinerSearchIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,56,7};
        int target = 56;
        System.out.println(findIndex(arr, target, 0));
    }
    static  int findIndex(int[] arr, int target, int index){
        if(index == arr.length)
            return  -1;

        if(arr[index] == target)
            return  index;
        else
            return findIndex(arr, target, index + 1);
    }
}
