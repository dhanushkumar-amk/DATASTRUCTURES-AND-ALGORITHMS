package OBJECT_ORIENTED_PROGRAMMING.INHERITANCE;

public class BoxWeight extends BOX {
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double l, double w, double h, double weight){

      //
        super(l,w,h);
        this.weight = weight;
    }
}
