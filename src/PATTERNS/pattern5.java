package PATTERNS;

public class pattern5 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("The output is : ");
        pattern(n);
    }
    static  void  pattern(int n){

        for (int i = 0; i <=n ; i++) {
            for (int k = 1; k <= n-i ; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

/*
      *
     *  *
    *  *  *
   *  *  *  *
  *  *  *  *  *
  */