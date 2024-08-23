package MATHEMATICALS;

public class SumOfSquareNumbers {
    public static void main(String[] args) {
        int n = 73;
        System.out.println(SquareNumber(n));
    }
    static  boolean SquareNumber(int n){

        if( n <= 0)
            return  false;


        int left = 0;
        int right = (int) Math.sqrt(n);


        while (left <= right){
            long sum = left * left + right * right;

            if( sum == n)
                return  true;
            else if(sum < n)
                left++;
            else
                right--;
        }

        return false;
    }
}
