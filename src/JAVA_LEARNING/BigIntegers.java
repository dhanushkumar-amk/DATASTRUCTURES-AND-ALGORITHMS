package JAVA_LEARNING;

import  java.math.BigInteger;
public class BigIntegers {
    public static void main(String[] args) {

        int a = 30;
        int b = 20;

        // we can also have the integer value that convert into the bigInteger
        BigInteger A = BigInteger.valueOf(33);
        BigInteger B = BigInteger.valueOf(337565);


        // we can also store the string values
        BigInteger C = new BigInteger("64746556874675645678654854767");

        // we can also store the constants

        BigInteger D = BigInteger.ONE;
        BigInteger E = BigInteger.TWO;
        BigInteger F = BigInteger.TEN;


//        System.out.println(E);


        // operations in BigInteger
        System.out.println(A.add(C));
    }
}
