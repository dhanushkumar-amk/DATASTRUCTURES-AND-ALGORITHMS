package JAVA_LEARNING.BIGVALUES;

public class StringBuffers {
    public static void main(String[] args) {

        // constructor 1
        StringBuffer sb1 = new StringBuffer();

        // constructor 2
        StringBuffer sb2 = new StringBuffer("Hello world");

        // constructor 3
        StringBuffer sb3 = new StringBuffer(30);  // to define size

        sb1.append("Welcome to world");

        System.out.println(sb1);
    }

}
