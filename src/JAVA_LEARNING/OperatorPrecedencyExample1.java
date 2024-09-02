package JAVA_LEARNING;

public class OperatorPrecedencyExample1 {

    public static void main(String[] args) {
        int m = 10;
        int n = 10;
        int res = m++ / (++n * n--) / --m;
        System.out.println(res);
    }
}
