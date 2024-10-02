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
        System.out.println(A.subtract(C));
        System.out.println(A.multiply(C));
        System.out.println(A.divide(C));
        System.out.println(A.remainder(C));
        System.out.println(A.sqrt());
        System.out.println(A.pow(5));

        // we can also do manyThings

        // convert the BigInteger to int using intValue();
        int g = B.intValue();
        System.out.println(g);


        System.out.println(fact(100));
        // 93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000

        System.out.println(fact1(5));
    }


    // bigInteger use case  in factorial program

    static  BigInteger fact(int num){
        BigInteger ans = new BigInteger("1");

        for (int i = 2; i <= num ; i++) {
            ans = ans.multiply(BigInteger.valueOf(i));
        }
        return ans;
    }

    static  int fact1(int n){
        int ans = 1;

        for (int i = 2; i <= n ; i++) {
            ans *= i;
        }
        return ans;
    }
}
