package Z_COMPANY_BASED_PROBLEMS_Z.Accenture;

public class CanopyArea {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(canopyAreaCalculation(n));
    }
    static  int canopyAreaCalculation(int n){

        float area = (float) (3.14 * n * n);
         return (int) Math.round(area);
    }
}
