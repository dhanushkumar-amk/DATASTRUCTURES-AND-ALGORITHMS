package OOPS;



// function inside the class is called method and outside the class is called functions
// in java every thing is located inside the class so we call method in java

public class Methods {
    public static void main(String[] args) {
     // function calling
     add();
     add1(10,30);
    }

    // function definition
    // void function without parameters
    public  static void add(){  // void is a return type    => void refers to return no values
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
    }

    // void function with parameters
    public  static  void  add1(int a, int b){
        int c = a + b;
    }
}


// two parts

// function definition - to define the function
// function calling - to call the function


// void function  => it does't return value
// non void function => it returns some value