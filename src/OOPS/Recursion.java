package OOPS;

// recursion a function calls itself as a function definition
public class Recursion {
    public static void main(String[] args) {
        naturalNumber(10);
    }
    public static  void naturalNumber(int n){
        // base case
        if(n == 10) System.out.println(1);
        else {
            System.out.println(n);
            // recursive case
            naturalNumber(n+1);
        }
    }
}


// two concepts
// base case => in this case the function has been ended
// recursive case => in this case the function calls repeated