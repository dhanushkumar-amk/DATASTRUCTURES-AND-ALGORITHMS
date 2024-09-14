package Z_COMPANY_BASED_PROBLEMS_Z.Accenture;

public class CarryNumbers {
    public static void main(String[] args) {
        int num1 = 451;
        int num2 = 349;
        System.out.println(carry(num1, num2));
    }
    static  int carry(int num1, int num2){
        int count = 0;
        int sum = 0;
        int carry = 1;

        while ((num1 != 0) && (num2 != 0)){
            int p = num1 % 10;
            int q = num2 % 10;

            sum = p + q + carry;

            if(sum > 9){
                carry = 1;
                count++;
            }
            else
                carry = 0;


            num1 /= 10;
            num2 /= 10;

        }

        return  count;
    }
}
