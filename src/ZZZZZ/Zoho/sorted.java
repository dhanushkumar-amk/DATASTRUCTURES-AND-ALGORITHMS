package ZZZZZ.Zoho;

public class sorted {
    public static void main(String[] args) {
        int[]  arr= {12,13,14,15,16};
        System.out.println(arrayIsSorted(arr));
    }
    static  boolean arrayIsSorted(int[] arr){

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] < arr[i+1])
                return  true;
        }
        return  false;

    }
}
