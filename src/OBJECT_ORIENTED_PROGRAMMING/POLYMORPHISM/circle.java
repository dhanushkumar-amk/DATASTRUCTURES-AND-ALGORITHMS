package OBJECT_ORIENTED_PROGRAMMING.POLYMORPHISM;

public class circle extends  shapes{

 @Override
    void area(){
        System.out.println("Area r* r * pi :");
    }

//    @Override   wen the function doesn't not override then it will show error on override
    void area1(){
        System.out.println("Override is called anatations");
    }
}



