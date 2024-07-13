package PATTERNS;

public class pattern8 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("The output is : ");
        pattern(n);
    }
    static  void  pattern(int n){
        int count = 1;

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count++ + " ");

            }
            count = 1;
            System.out.println();
        }
    }
}
