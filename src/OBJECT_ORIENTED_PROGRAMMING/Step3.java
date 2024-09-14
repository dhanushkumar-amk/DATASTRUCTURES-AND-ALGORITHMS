package OBJECT_ORIENTED_PROGRAMMING;

import static OBJECT_ORIENTED_PROGRAMMING.importPackage.message;

// import statement used to import method from one file to another file;


public class Step3 {

    public static void main(String[] args) {

//        message();


    human dhanush = new human(20,"dhanushkumar",1000000);
    human jack = new human(10,"jack sparrow",10000);


    }


}


class  human {
//    public static void main(String[] args) {
        int age;
        String name;
        int salary;

        public  human(int age, String name, int salary){
            this.age = age;
            this.name = name;
            this.salary = salary;
        }


    }




//}
