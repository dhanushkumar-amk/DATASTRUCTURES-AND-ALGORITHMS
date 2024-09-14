package ZZZZZ.Accenture;

public class CompleteCalculate {
    public static void main(String[] args) {
        int a = 12;
        int b = 50;
        System.out.println(calculate(a,b));
    }
    static  int  calculate(int a, int b){
        int sum = 0;

        for (int i = a; i <=b ; i++) {
            if(i % 15 == 0){
                sum += i;
            }
        }
        return  sum;
    }
}
