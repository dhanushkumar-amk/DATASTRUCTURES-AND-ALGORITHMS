package ZZZZZ.Accenture;

public class TwoDiceProblem {
    public static void main(String[] args) {
int  n = 10;
        System.out.println(countPairs(n));
    }
    static  int countPairs(int n){
        int count = 0;

        // base conditions
        if(n > 12 || n < 2) return  0;

        for (int i = 1; i <= 6 ; i++) {
            if((n - i) <= 6){
                System.out.println("(" + i + " , " + (n-i)+ ")");
                count++;
            }
        }

        return  count;
    }
}
