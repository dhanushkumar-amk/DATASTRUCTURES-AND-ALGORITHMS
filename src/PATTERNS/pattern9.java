package PATTERNS;

public class pattern9 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("The output is : ");
        pattern(n);
    }
    static  void  pattern(int n){
        for (int i = n; i >= 1 ; i--) {
            for (int j = i; j <=n ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}


/*
5
4 4
3 3 3
2 2 2 2
1 1 1 1 1

 */