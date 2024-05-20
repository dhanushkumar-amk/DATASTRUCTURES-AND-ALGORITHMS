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

        System.out.println("--------------------------------------------------------------------");


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
        System.out.println("--------------------------------------------------------------------");

        // charAt() method  - return the character based on the index
        String name2 = "Sanjay";
        System.out.println(name2);
        System.out.println(name2.charAt(2)); //return 3 index of character here n
        System.out.println("--------------------------------------------------------------------");


        // contains() method - to check the value is present or not in main string check if s2 is a path of s1 it exit then return  true else return false and it is a case sensitive
        // it always return true or false
        name2 = "SanjayKumar";
        String name3 = "Sanjay";
        System.out.println(name2.contains(name3));
        System.out.println("--------------------------------------------------------------------");



        //  equals(),  equalsIgnoreCase() - compare strings
        // it always return true or false
        // case sensitivity
        String Compare1 = "Hello";
        String Compare2 = "Hello";

        System.out.println(Compare1 == Compare2); // true
        System.out.println(Compare1.equals(Compare2)); // true
        System.out.println(Compare1.equals("welcome")); // false
        System.out.println(Compare1.equals("welcome")); // false


        System.out.println("--------------------------------------------------------------------");

        // equalIgnoreCase() => it ignores Case sensitivity
        String Compare3 = "Hello";
        String Compare4 = "hello";

        System.out.println( "Equals :" + Compare3.equals(Compare4));
        System.out.println( "EqualsIgnoreCase :" + Compare3.equalsIgnoreCase(Compare4));

        System.out.println("--------------------------------------------------------------------");

        // replace Method() - used to replace the values in a string

        String Replace =  "Hello World";
        // replace a single character
        System.out.println("Before Replace :" + Replace);
        System.out.println("After Replace : " + Replace.replace("H" , "G"));
        System.out.println();

        // replacing sequence of characters
        System.out.println("Before Replace :" + Replace);
        System.out.println("After Replace : " + Replace.replace("Hello World" , "Hello Dhanush"));

        System.out.println("--------------------------------------------------------------------");

        // subString() method is a important || =>  exact substring from a main string or exact some portion of a string
        // Start index = 0;
        // end index + 1
        String SubString1 = "Dhanush";
        System.out.println(SubString1.substring(0,1));
        System.out.println(SubString1.substring(0,2));
        System.out.println(SubString1.substring(0,3));
        System.out.println(SubString1.substring(0,4));
        System.out.println(SubString1.substring(0,5));
        System.out.println(SubString1.substring(0,6));
        System.out.println(SubString1.substring(0,7));
        System.out.println("--------------------------------------------------------------------");

        // case Conversions
        // 1 toLowerCase
        // 2 toUpperCase
        System.out.println("word : "+name);
        System.out.println("Lower Case : "+name.toLowerCase());
        System.out.println("Upper case : " +name.toUpperCase());

        System.out.println("--------------------------------------------------------------------");

        // split() method -  split the string into the multiple lines based on delimeter  => (delimeter every element in the string is a delemeter)
        String email = "Dhanushkumaramk@gmail.com";
        System.out.println("Before Splitting : " + email);
        // System.out.println("After  splitting : " + email.split("@" ));
        System.out.println("--------------------------------------------------------------------");
        System.out.println();



        // String Builder and String Buffer
        System.out.println("String Builder and String Buffer");
        System.out.println();

        StringBuffer obj = new StringBuffer("Hello "); // it gives extra 16 spaces
        // reverse method
        System.out.println(obj);
        System.out.println(" Reverse : "+obj.reverse());
        System.out.println("--------------------------------------------------------------------");


        // append method used to insert the value
        StringBuffer obj1 = new StringBuffer("Hello "); // it gives extra 16 spaces
        System.out.println(obj1);
        System.out.println("Append world with hello : " + obj1.append("world") );

    }
}
