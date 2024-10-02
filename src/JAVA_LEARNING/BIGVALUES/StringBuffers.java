package JAVA_LEARNING.BIGVALUES;

import java.util.Random;

public class StringBuffers {
    public static void main(String[] args) {

        // constructor 1
        StringBuffer sb1 = new StringBuffer();

        // constructor 2
        StringBuffer sb2 = new StringBuffer("Hello world");

        // constructor 3
        StringBuffer sb3 = new StringBuffer(30);  // to define size

        sb1.append("Welcome to world");
        sb1.append(" or die");  // it does not create the any new objects it will append on own

        sb1.insert(7, " welcome ");

        sb1.replace(0,5,"hello ");

//        sb1.reverse();
//        System.out.println(sb1);

        System.out.println(random(20));
    }



    // Generate the random string
    static  String random(int size){
        StringBuffer s = new StringBuffer(size);

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            int randomChar = 97 + (int)(random.nextFloat() * 26);
            s.append((char) randomChar);
        }
        return s.toString();
    }
}
