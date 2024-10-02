package JAVA_LEARNING.BIGVALUES;

import java.math.BigDecimal;

public class BigDecimals {
    public static void main(String[] args) {
    double x = 0.03;
    double y = 0.04;
     double ans = y - x;
     System.out.println(ans);  // 0.010000000000000002


        BigDecimal A = new BigDecimal("0.03");
        BigDecimal B = new BigDecimal("0.04");
        BigDecimal ans1 = B.subtract(A);

        System.out.println(ans1);   // 0.01

        // we can also use  operations like bigInteger


    }

}
