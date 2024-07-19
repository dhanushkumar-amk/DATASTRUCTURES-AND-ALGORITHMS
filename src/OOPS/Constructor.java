package OOPS;

public class Constructor {
    public static void main(String[] args) {
        // parameterized constructor
        sample obj = new sample(21,45);
        System.out.println(obj.maks);
    }
}
class sample{
    int rollNO;
    int maks;

    sample(int rollNo, int maks){
        System.out.println("This is default constructor");
        rollNO = rollNo;
        maks= maks;
    }
}


// two types
//default constructor
//parameterized constructor

// default constructor does't do nothing it simple create the object for the class

// parameterized constructor creates the object and also passes the parameter inside the constructor