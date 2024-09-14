package Z_COMPANY_BASED_PROBLEMS_Z.Accenture;

public class ReverseANumber {
    public static void main(String[] args) {
        int n = 1234;

        int reverseNumber = 0;
        while (n != 0) {

            int digit = n % 10;
           reverseNumber = reverseNumber * 10 + digit;
            n = n/10;
        }
        System.out.println(reverseNumber);
    }
}
