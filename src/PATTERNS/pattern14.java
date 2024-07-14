package PATTERNS;

public class pattern14 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
    static void pattern(int n){
        for (int i = 1; i <= n; i++)
        {
            for (int j = i; j >= 1; j--)
            {
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}

/*
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
 */