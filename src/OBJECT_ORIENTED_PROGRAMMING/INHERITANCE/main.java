package OBJECT_ORIENTED_PROGRAMMING.INHERITANCE;

import javax.swing.*;

public class main {
    public static void main(String[] args) {

        // default constructor
//        BOX box = new BOX();
        /*
         BOX(){
        this.height = -1;
        this.length = -1;
        this.width = - 1;
    }
         */


        // all side
//        BOX box = new BOX(4);

        /*

    // cube
    // one arguments
    BOX(double side){
        this.width = side;
        this.height = side;
        this.length = side;
    }
         */

//        BOX box = new BOX(4,5,8);
/*
// three arguments
     BOX(double length, double height, double width){
        this.width =  width;
        this.height = height;
        this.length = length;
    }
 */


        // copy constructor

//        BOX box1 = new BOX(5,6,7);
//        BOX box2 = box1;

        BoxWeight box3 = new BoxWeight();

        System.out.println(box3.height);
        System.out.println(box3.weight);


        /*
        BOX(BOX old){
            this.width = old.width;
            this.length = old.length;
            this.height  = old.height;
        }
         */

//        System.out.println(box1.length + " " +  box1.height + " " + box1.width);
    }
}
