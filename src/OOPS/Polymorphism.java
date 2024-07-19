package OOPS;
public class Polymorphism {
    void display(){
        System.out.println("I am a void function");
    }

    void display(int n){
        System.out.println(n);
    }


    void display(int n, int m){
        System.out.println(n);
        System.out.println(m);

    }
}

class print{
    public static void main(String[] args) {
        Polymorphism obj = new Polymorphism();

        // method overloading
        obj.display();
        obj.display(5);
        obj.display(10,10);
    }
}


// same function has different parameters or different task
// here example is display function