package PATTERNS;

public class pattern56 {
    public static void main(String[] args) {
        int rows = 5;
        pattern(rows);
    }
    static void pattern(int rows){
        char ch;

        //Printing upper half of the pattern

        for (int i = 1; i <= rows; i++)
        {
            ch='A';

            for (int j = 2*rows-i; j > i; j--)
            {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--)
            {
                System.out.print(ch+" ");

                ch++;
            }

            System.out.println();
        }

        //Printing lower half of the pattern

        for (int i = rows-1; i >= 1; i--)
        {
            ch='A';

            for (int j = 2*rows-i; j > i; j--)
            {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--)
            {
                System.out.print(ch+" ");

                ch++;
            }

            System.out.println();
        }
    }
}

/*
C:\Users\hp5cd\.jdks\openjdk-22.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.1\lib\idea_rt.jar=59304:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\hp5cd\OneDrive\Documents\DATASTRUCTURES-AND-ALGORITHMS\out\production\DATASTRUCTURES-AND-ALGORITHMS PATTERNS.pattern56
        A
      A B
    A B C
  A B C D
A B C D E
  A B C D
    A B C
      A B
        A
 */