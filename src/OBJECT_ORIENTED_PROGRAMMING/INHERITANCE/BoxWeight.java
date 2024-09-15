package OBJECT_ORIENTED_PROGRAMMING.INHERITANCE;

public class BoxWeight extends BOX {
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double l, double w, double h, double weight){

      //super define the get the element from parent class

        super(l,w,h); // call the parent class constructor
        this.weight = weight;
    }
}
