package OBJECT_ORIENTED_PROGRAMMING;

public class WrapperClass_Step2 {
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
    }

    static  void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;


        System.out.println(a + " " +  b);
    }





}
