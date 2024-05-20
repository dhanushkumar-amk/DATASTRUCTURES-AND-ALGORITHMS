package STRINGS;
import java.lang.String;

public class StringBuilder {
    public static void main(String[] args) {
//         compareing the two strings using ==
//        String name  = "Dhanushkumar";
//        String name1 = "Dhanushkumar";
//        System.out.println(name == name1);

        // two methods
//        build in method
//        user defined method


//        different ways to create Strings in java
//        String name = "Dhanushkumar";
//        String name1 = new String("hello world")

//        Methods in String
        String name = "Dhanushkumar";

//        length() method   - to see the length of a String
        System.out.println(name.length());
        System.out.println("Welcome".length());

//        Concat()  - to join a two strings
//        + and concate() method
        String s1 = "hello";
        String s2 = "world";
        String s3 = "!";
   /*     System.out.println(s1 + s2);
        System.out.println(s1.concat(s2));
        System.out.println(s1+s2+s3);
    */
        System.out.println(s1.concat(s2.concat(s3))); // to join two or more string
        System.out.println("--------------------------------------------------------------------");

// trim() method  - remove spaces from right and left side of a string
        String s = "   Welcome   "; // 13 length
        System.out.println(s);
        System.out.println("Before Trimming : " +s.length());
        System.out.println(s.trim());
        System.out.println("After Trimming : " + s.trim().length());
    }
}
