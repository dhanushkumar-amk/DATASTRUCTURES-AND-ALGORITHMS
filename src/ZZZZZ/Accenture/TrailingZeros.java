package ZZZZZ.Accenture;

public class TrailingZeros {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(CountZeros(n));
    }
    static  int CountZeros(int n){
        if(n < 5) return 0; // there is no zeros in the less than 5!(factorial)

        int sum = 0;
        while(n >= 5){
            sum += n/5;
            n /= 5;
        }
        return  sum;
    }
}
