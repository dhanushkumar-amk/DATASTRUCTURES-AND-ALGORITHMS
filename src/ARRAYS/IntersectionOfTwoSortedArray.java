package ARRAYS;

import java.util.ArrayList;

public class IntersectionOfTwoSortedArray {
    public static void main(String[] args) {
        int arr1[] ={1,2,3,3,4,6,7};
        int arr2[] = {2,3,3,4,5,7};
        ArrayList<Integer> Intersection = IntersectionTwoSoretd(arr1, arr2);

        for (int i = 0; i < Intersection.size() ; i++) {
            System.out.print(Intersection.get(i) + " ");
        }
    }

    public static ArrayList<Integer> IntersectionTwoSoretd(int arr1[], int arr2[]){
        ArrayList<Integer> Intersection = new ArrayList<>();
        int i =0;
        int j=0;
        while( i<arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j])
                i++;
            else if(arr2[j] < arr1[i])
                j++;
            else{
                Intersection.add(arr1[i]);
                i++;
                j++;
            }
        }

        return  Intersection;
    }
}
