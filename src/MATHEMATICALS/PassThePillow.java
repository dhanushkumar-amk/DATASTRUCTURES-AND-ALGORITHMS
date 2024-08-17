package MATHEMATICALS;

public class PassThePillow {
    public static void main(String[] args) {
        int n = 4;
        int time = 5;
        System.out.println(pass(n, time));
    }
    static  int pass(int n, int time){
        int remainder = time % (2*n-2);

        if(remainder <= n-1)
            return  remainder + 1;
        else
            return (2 * n - 2) - remainder + 1;
    }
}
