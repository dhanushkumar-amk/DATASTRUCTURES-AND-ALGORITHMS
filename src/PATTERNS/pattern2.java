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
                if(i * j < 10) System.out.print("0"); // for printing zero in th front
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}

// output :

/*
        01 02 03 04 05
        02 04 06 08 10
        03 06 09 12 15
        04 08 12 16 20
        05 10 15 20 25

 */