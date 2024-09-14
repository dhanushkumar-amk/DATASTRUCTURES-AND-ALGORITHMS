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
        System.out.println(a);
        System.out.println(b);

        System.out.println(num);
    }

    static  void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}
