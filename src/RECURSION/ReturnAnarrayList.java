package RECURSION;

import java.util.ArrayList;

public class ReturnAnarrayList {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,56,56,7};
        int target = 56;

        System.out.println(findAllIndex(arr, target, 0, new ArrayList<>()));
    }
  static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length)
            return list;

        if(arr[index] == target )
            list.add(index);

        return  findAllIndex(arr, target, index + 1 , list);
  }

}
