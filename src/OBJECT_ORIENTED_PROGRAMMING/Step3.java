package OBJECT_ORIENTED_PROGRAMMING;

import static OBJECT_ORIENTED_PROGRAMMING.importPackage.message;

// import statement used to import method from one file to another file;


public class Step3 {

    public static void main(String[] args) {

//        message();


    human dhanush = new human(20,"dhanushkumar",1000000);
    human jack = new human(10,"jack sparrow",10000);

    // so population is common to all
        System.out.println(dhanush.population);
        System.out.println(jack.population);

    }
}


class  human {
//    public static void main(String[] args) {
        int age;
        String name;
        int salary;

    // static means it is common to all the objects within a class
    static  long population;

    human(int age, String name, int salary){

            this.age = age;
            this.name = name;
            this.salary = salary;

            // we can access the static variable only by class name in an object
            human.population += 1;
        }


    }


    class  main{
        public static void main(String[] args) {

        }


        // we cnn't access the no static method inside the static method
        // static method isn't belongs to object
        static  void  fun(){
//            greeding();
        }

        // it id belong to the object
        void greeding(){
            System.out.println("hello world");
        }
}