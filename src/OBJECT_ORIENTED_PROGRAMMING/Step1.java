package OBJECT_ORIENTED_PROGRAMMING;

import java.util.Arrays;

public class Step1 {
    public static void main(String[] args) {

        // store 5 rollNo
        int[] roll = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students that consists of name roll no,marks within an single data structure
        // here will be used objected oriented programming

        //we can create a own  own data type using class
        Student[] students = new Student[5];

        // just declaring
        //Student dhanush;

        // System.out.println(Arrays.toString(students));
         //default value of an object is a null

        //dhanush = new Student();

         //one line expression
       // Student dhanush = new Student();
        //Student dhanush = new Student(10, "arun",45.6f);
        //System.out.println(dhanush);  // it provide some random value

       // Student ram = new Student(12,"Ram",34.5f);


        //System.out.println(ram.name);
        //System.out.println(ram.roll);
        //System.out.println(ram.marks);


        // dhanush details will be fixed
//        dhanush.roll = 10;
//        dhanush.name = "dhaushkumar";
////        dhanush.marks = 90.6f;

        //System.out.println(dhanush.roll);
        //System.out.println(dhanush.name);
      //  System.out.println(dhanush.marks);

       // dhanush.greeting();
/*
          default values

        int , long short, byte = 0
        String = null;
        float = 0.0;
        boolean = false;
        */
    }
}


// create a class
class Student{
    int roll;
    String name;
//    float marks;
    float marks = 80.5f;  // we can also set default value




// constructor

    // return type is a class
    // no need any return type

    Student(){
        this.roll = 10;
        this.name = "dhaushkumar";
        this.marks = 90.6f;



    }

void greeting(){
    System.out.println(this.name);
}
    // this keyword simply replaces the dhanush.name dhanush.roll, dhanush.mark


    Student( int roll, String name, float marks){
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }


    // now we can create n number of objects using this
//    ex

//    Student ram = new Student(12,"Ram",34.5f);
//
//
//        System.out.println(ram.name);
//        System.out.println(ram.roll);
//        System.out.println(ram.marks);


}