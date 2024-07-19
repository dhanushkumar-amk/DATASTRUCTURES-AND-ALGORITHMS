package OOPS;

public class inheritance {

}

class animal{
    int noLegs = 4;

    public static  void eat(){
        System.out.println("I will eat");
    }
    public static void walk(){
        System.out.println("I can be walk");
    }
}

class dog extends animal{
    Boolean canBark = true;
}

class  call{
    public static void main(String[] args) {
        animal obj = new animal();
        System.out.println(obj.noLegs);
    }
}