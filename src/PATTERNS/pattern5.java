package PATTERNS;

public class pattern5 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("The output is : ");
        pattern(n);
    }
    static  void  pattern(int n){
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(" + ");
            }
        }
    }
}
