package OBJECT_ORIENTED_PROGRAMMING.INHERITANCE;

public class BOX {
    double length;
    double height;
    double width;

    // zero arguments
    BOX(){
        this.height = -1;
        this.length = -1;
        this.width = - 1;
    }

    // cube
    // one arguments
    BOX(double side){
        this.width = side;
        this.height = side;
        this.length = side;
    }

    // three arguments
     BOX(double length, double height, double width){
        this.width =  width;
        this.height = height;
        this.length = length;
    }


    // copy constructor
    BOX(BOX old){
        this.width = old.width;
        this.length = old.length;
        this.height  = old.height;
    }




}
