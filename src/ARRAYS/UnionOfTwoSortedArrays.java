package ARRAYS;

import java.util.ArrayList;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3,4,5,5};
        int[] arr2 = {1,1,3,4,5,6};
        int n = 7;
        int m = 6;
        ArrayList<Integer> Union = UnionOfArrays(arr1,arr2,n,m);
        for (int value : Union){
            System.out.print(value + " ");
        }
    }
    public static ArrayList<Integer> UnionOfArrays(int[] arr1, int arr2[], int n, int m){
        int i =0;
        int j = 0;

        ArrayList<Integer> Union = new ArrayList<>();
        while(i < n && j < m){
            if(arr1[i] <= arr2[j]){
                if(Union.size() == 0 || Union.get(Union.size()-1) != arr1[i]){
                    Union.add(arr1[i]);
                }
                i++;
            }
            else {
               if(Union.size() == 0 || Union.get(Union.size()-1) != arr2[j]){
                    Union.add(arr2[j]);
                }
                j++;
            }
        }

        while(i < n){
          if(Union.size() == 0 || Union.get(Union.size()-1) != arr1[i]){
                Union.add(arr1[i]);
            }
            i++;
        }


        while(j < n){
            if(Union.size() == 0 || Union.get(Union.size()-1) != arr2[j]){
                Union.add(arr2[j]);
            }
            j++;
        }

        return Union;
    }
}
