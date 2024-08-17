package ZZZZZ.Accenture;

public class CalculateSumOfPrimeindexValueInAnArray {
    public static void main(String[] args) {
    int[] arr = {10,20,30,40,50};
        System.out.println(SumOfPrime(arr));
    }
 public static  boolean isPrime(int num){
        if(num <= 1 || num == 2)
            return  false;

        for (int i = 1; i < num ; i++) {
            if(num % i == 0)
                return  false;
        }
        return  true;
    }

   public static  int SumOfPrime(int[] arr){
        int totalSum = 0;

        for (int i = 0; i <arr.length; i++) {
            if(isPrime(i))
                totalSum += arr[i];
        }
        return  totalSum;
    }

}
