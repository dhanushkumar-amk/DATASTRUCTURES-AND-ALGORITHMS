package PATTERNS;

public class pattern21 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
    static void pattern(int n){
        for (int i = n; i >= 1; i--)
        {
            //Printing spaces at the beginning of each row

            for (int j = 2*n-i; j > i; j--)
            {
                System.out.print(" ");
            }

            //Printing i to 1 value at the end of each row

            for (int j = i; j >= 1; j--)
            {
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}

/*
5 4 3 2 1
  4 3 2 1
    3 2 1
      2 1
        1
 */