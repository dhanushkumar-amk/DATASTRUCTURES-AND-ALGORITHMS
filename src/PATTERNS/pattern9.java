package PATTERNS;

public class pattern9 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("The output is : ");
        pattern(n);
    }
    static  void  pattern(int n){
        for (int i = n; i >= 0 ; i--) {
            for (int j = i; j <=n ; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
