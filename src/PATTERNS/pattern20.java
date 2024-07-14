package PATTERNS;

public class pattern20 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
    static void pattern(int n){
        for (int i =n; i >= 1; i--)
        {
            //Printing spaces at the beginning of each row

            for (int j = 2*n-i; j > i; j--)
            {
                System.out.print(" ");
            }

            //Printing 1 to i value at the end of each row

            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}

/*
1 2 3 4 5
  1 2 3 4
    1 2 3
      1 2
        1

 */