package RECURSION;


// in-efficient  way
public class PowerOfXandY {
    public static void main(String[] args) {
        int x = 5;
        int y = 8;
        System.out.println(power(x,y));
    }
    static  long power(int x, int y){
        // base case
        if(y == 0)
            return 1;

        if(y % 2 == 0)
            return power(x, y/2) * power(x, y/2);
        else
            return power(x, y-1) * x;
    }
}
