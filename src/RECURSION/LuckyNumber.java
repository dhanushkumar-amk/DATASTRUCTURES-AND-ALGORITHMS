package RECURSION;

public class LuckyNumber {
    public static void main(String[] args) {
        int num = 10;
        int counter = 2;
        boolean ans = luck(num,counter);
        if ( ans == true)
            System.out.println("It is a a lucky number ");
        else
            System.out.println("It is a unlucky number");
    }
    static boolean luck(int num, int counter){

        // base case
        if (num < counter)
            return true;

        if (num % counter == 0)
            return  false;

        return  luck(num - (num / counter), counter+1);
    }
}
