package ZZZZZ.Accenture;

public class CanopyArea {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(canopyAreaCalculation(n));
    }
    static  int canopyAreaCalculation(int n){

        int area =  (3.14 * n * n);
         return  Math.abs(area);
    }
}
