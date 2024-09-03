public class SUMOFARRAY {
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,6};
       System.out.println(sumOfArray(arr));
    }
    static int sumOfArray(int[] arr){
        int sum = 0;
        
        for(int i = 0; i < arr.length; i++)
        sum += arr[i];
    
    return sum;
    }
}
