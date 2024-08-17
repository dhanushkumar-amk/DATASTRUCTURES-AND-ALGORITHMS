package ZZZZZ.Accenture;

public class CanopyArea {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(canopyAreaCalculation(n));
    }
    static  float canopyAreaCalculation(int n){

        float area = (float) (3.14 * n * n);
         return (int) Math.round(area);
    }
}
