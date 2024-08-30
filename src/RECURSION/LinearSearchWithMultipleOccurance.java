package RECURSION;

import java.util.ArrayList;

public class LinearSearchWithMultipleOccurance {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,56,56,7};
        int target = 56;
        findAllOccurrance(arr, target,0);
        System.out.println(list);
//        System.out.println(findAllOccurrance(arr, target, 0));
    }
    static  ArrayList<Integer> list = new ArrayList<>();
    static  void findAllOccurrance(int[] arr, int target, int index){

        // base case
        if( index == arr.length)
            return ;

        if(arr[index] == target)
            list.add(index);

        findAllOccurrance(arr, target, index + 1);
    }

}
