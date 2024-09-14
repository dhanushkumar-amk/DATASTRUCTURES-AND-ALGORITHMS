package OBJECT_ORIENTED_PROGRAMMING;

public class Step2 {
    public static void main(String[] args) {
        int n = 5;

        // wrapper class


        // treated like an object
        Integer num = 5;
//        num.toString()
//        it has to many functions


        Integer a = 10;
        Integer b = 20;


        swap(a, b);

        // here the swap will not be change
        // because here it is an pass by reference
        System.out.println(a);
        System.out.println(b);

        // the value of a and b is not swap

//        System.out.println(num);



        //  once we create a variable are anything then we can't be modified again
        final int bonus = 11;
        System.out.println(bonus);
        /*

        when we try to modified it shows error
        bonus = 10;
        bonus += 5;

      */

    }

    static  void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;


        System.out.println(a + " " +  b);
    }





}


class A{
    final int num = 10;

    String name;





}