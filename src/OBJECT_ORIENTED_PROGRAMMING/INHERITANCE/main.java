package OBJECT_ORIENTED_PROGRAMMING.INHERITANCE;

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

        BOX box = new BOX(4,5,8);




        System.out.println(box.height + " " +  box.length + " " + box.width);
    }
}
