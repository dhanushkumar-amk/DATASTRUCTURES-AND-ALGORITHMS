package OBJECT_ORIENTED_PROGRAMMING;

public class ProblemsMeets {
    public static void main(String[] args) {

        // store 5 rollno
        int[] roll = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students that consists of name roll no,marks within an single data structure
//        here will be used objected oriented programming

        //we can create a own  own data type using class
        Student[] students = new Student[5];

        Student dhanush;

        System.out.println();

    }


    // create a class
    class Student{
        int[] roll = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];
    }
}
