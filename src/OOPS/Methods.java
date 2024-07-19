package OOPS;



// function inside the class is called method and outside the class is called functions
// in java every thing is located inside the class so we call method in java

public class Methods {
    public static void main(String[] args) {
     // function calling
     add();
    }

    // function definition
    public  static void add(){  // void is a return type    => void refers to return no values
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
    }
}



// two parts

// function definition - to define the function
// function calling - to call the function