package PATTERNS;

public class pattern3 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("The output is : ");
        pattern(n);
    }
    static  void  pattern(int n){
     int count;
        for (int i = 0; i < n ; i++) {
            count = i + 1;
            for (int j = 0; j <n ; j++) {
                System.out.print( count++ + " ");
            }
            System.out.println();
        }
    }
}

/*
    1 2 3 4 5
    2 3 4 5 6
    3 4 5 6 7
    4 5 6 7 8
    5 6 7 8 9
 */