package OOPS;

public class Polymorphism {
    void display(){
        System.out.println("I am a void function");
    }

    void display(int n){
        System.out.println(n);
   display();
    }


}
class print{
    public static void main(String[] args) {
        Polymorphism obj = new Polymorphism();
        obj.display();
        obj.display(5);
    }
}
