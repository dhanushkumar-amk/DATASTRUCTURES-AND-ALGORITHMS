package PATTERNS;

public class pattern2 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("The output is : ");
        pattern(n);
    }
    static  void  pattern(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if(i * j < 10) System.out.print("0");
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
