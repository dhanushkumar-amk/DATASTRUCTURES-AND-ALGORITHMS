package OOPS;

public class Constructor {
    public static void main(String[] args) {
        sample obj = new sample();
        System.out.println(obj.maks);
    }
}
class sample{
    int rollNO;
    int maks;

    sample(){
        System.out.println("This is default constructor");
        rollNO = 10;
        maks= 20;
    }
}
