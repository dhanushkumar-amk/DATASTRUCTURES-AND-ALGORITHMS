package ZZZZZ.Accenture;

public class CalculateSumOfPrimeindexValueInAnArray {
    public static void main(String[] args) {
    int[] arr = {10,20,30,40,50,60,70,80,90};
        System.out.println(SumOfPrime(arr));
    }
    static  boolean isPrime(int num){
        if(num <= 1)
            return  false;

        if(num == 2)
            return false;

        for (int i = 2; i <num ; i++) {
            if(num % 2 == 0)
                return  false;
        }
        return  true;
    }

    static  int SumOfPrime(int[] arr){
        int totalSum = 0;

        for (int i = 0; i <arr.length ; i++) {
            if(isPrime(i))
                totalSum = arr[i];
        }
        return  totalSum;
    }

}
