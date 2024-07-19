package OOPS;

public class inheritance {

}
// animal is base class or super class
class animal{
    int noLegs = 4;

    public static  void eat(){
        System.out.println("I will eat");
    }
    public static void walk(){
        System.out.println("I can be walk");
    }
}

// dog class is a sub class
class dog extends animal{
    Boolean canBark = true;
    int noLegs = 5;
}


class  call{
    public static void main(String[] args) {
        animal obj = new animal();
        System.out.println(obj.noLegs);

    }
}

// METHOD overriding
//method overriding is the process of override the methods from the main class to sub class
// if we have to override the function that compilers only takes the subclass methods not main class method this method is called method overriding



// inheritance is the idea of reusability
// it means we can reuse the code from different classes

// we can get the value from one class o another using extends keyword

// types of inheritance
 // 1 > single inheritance one parent = one child
// 2 > multi level inheritance grand parent = parent = child
// 3 > hierarchical inheritance = one parent = multiple child
// 4 > hybrid inheritance mixing of two or more inheritance
// 5 > multiple inheritance it has two or more parent but only onr child

// java does not support multiple inheritance directly so it gives the feature of interface