package RECURSION;

public class powerOfNumber {
    public static void main(String[] args) {
        System.out.println(power(5,8));
    }
    static  long power(int x, int y){

        if(y == 0)
            return 1;

        if(y % 2 == 0){
            long result = power(x, y/2);
            return result * result;
        }
        else
           return power(x, y-1)*x;

    }
}
