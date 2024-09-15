package OBJECT_ORIENTED_PROGRAMMING.POLYMORPHISM;

public class main {
    public static void main(String[] args) {
        shapes sp = new shapes();

        circle cir = new circle();
        square sq = new square();

        sp.area();
        cir.area();
        sq.area();
    }
}
