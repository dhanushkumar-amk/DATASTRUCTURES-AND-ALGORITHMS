package OBJECT_ORIENTED_PROGRAMMING.POLYMORPHISM;

public class Numbera {
    int sum(int a, int b){
        return  a + b;
    }
        int sum(int a, int b, int c){
            return  a + b + c;
        }

    public static void main(String[] args) {

        Numbera num = new Numbera();

        // method overloading
        num.sum(10,20);
        num.sum(5,4,6);
//        num.sum(5,4,3,2);
    }

}
