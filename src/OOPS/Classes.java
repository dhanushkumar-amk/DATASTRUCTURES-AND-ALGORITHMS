package OOPS;

// classes is a collection variables , identifiers and methods
// object is a instance of an object => copy of an classes

// creating a class
public class Classes {
         String name;
         int rollNo;

         // name and roll no is a member of a class

         public void display(){
             System.out.println(name);
             System.out.println(rollNo);
         }

         public  void setName(String str){
             name = str;
         }
}

class main{
    public static void main(String[] args) {

        // creating an object
        Classes person = new Classes();
        // Classes is a class name
        // new keyword is used to allocate memory space

        // we can assign the value using object instance
         person.setName("Dhanush");
        person.rollNo = 10;

        // calling the function using object instance
        person.display();

        // creating the another object
        Classes user = new Classes();
        user.name = "sanjay";
        user.rollNo = 20;
        user.display();
    }
}



// access modifier

// 1 > public
// this method can be access by any file or any where in this package
// the main function can must be public
// public modifier is used to get the value to the compiler that is a another seprate software


// 2 > private
// if we give private modifier to the function that function can be only access by inside the particular class
// the variable or method that can be private that only accessed inside he particular class

