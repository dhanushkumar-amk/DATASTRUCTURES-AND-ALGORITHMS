package PATTERNS;

public class pattern1 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
    static  void  pattern(int n){
        int count = 1;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}
