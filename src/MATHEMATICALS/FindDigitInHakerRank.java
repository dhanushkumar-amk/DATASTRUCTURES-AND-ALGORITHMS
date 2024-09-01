package MATHEMATICALS;

public class FindDigitInHakerRank {
    public static void main(String[] args) {
        int n = 104;
        System.out.println(digit(n));
    }

    static  int digit(int n){

        int temp = n;
        int count = 0;
        int lastDigit = 0;

        while (temp > 0){
            lastDigit = temp % 10;

            if (n % lastDigit == 0)
                count++;

            temp = temp / 10;
        }
        return count;
    }
}
