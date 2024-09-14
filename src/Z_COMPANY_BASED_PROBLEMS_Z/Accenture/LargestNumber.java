package Z_COMPANY_BASED_PROBLEMS_Z.Accenture;

public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = {33,44,55,66,77,99,88};
        System.out.println(largestNum(arr));
    }
    static  int largestNum(int[] arr){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] > max)
                max = arr[i];
        }

        return  max;
    }
}
