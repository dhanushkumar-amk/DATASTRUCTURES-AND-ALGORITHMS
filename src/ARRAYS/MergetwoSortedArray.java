package ARRAYS;

public class MergetwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,3,8,17};
        int[] arr2 = {5,6,7,8,21,27};

        float ans = merge(arr1, arr2);
        System.out.println(ans + " ");
    }

    public static float merge(int[] arr1, int[] arr2){

        int[] result = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while( i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                result[k] = arr1[i];
                i++;
                k++;
            }else{
                result[k] = arr2[j];
                j++;
                k++;
            }
        }
        while(i < arr1.length){
            result[k] = arr1[i];
            i++;
            k++;
        }
        while(j < arr2.length){
            result[k] = arr2[j];
            j++;
            k++;
        }

        if(result.length % 2 == 0){
            int mid = result.length / 2;
        return  (float)(result[mid] + result[mid-1])/2;
        }
        else {
            int mid = result.length/2;
            return  result[mid];
        }
    }

}
