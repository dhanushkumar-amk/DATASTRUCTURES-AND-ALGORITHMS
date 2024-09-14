package ZZZZZ.Accenture;

public class DifferenceOfSum {
    public static void main(String[] args) {
    int m = 4;
    int n = 20;
        System.out.println(difference(m,n));
    }
    static  int difference(int m, int n){
        int sum1 = 0;
        int sum2 = 0;

        int  result = 0;
        for (int i = 1; i <= n ; i++) {
            if(i % m == 0)
                sum1 += i;
            else
                sum2 += i;
        }

        result = Math.abs(sum1-sum2);

        return  result;
    }

}
