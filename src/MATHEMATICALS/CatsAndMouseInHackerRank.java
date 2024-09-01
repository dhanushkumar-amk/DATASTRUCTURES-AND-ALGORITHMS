package MATHEMATICALS;

public class CatsAndMouseInHackerRank {
    public static void main(String[] args) {
        int x = 2;
        int y = 4;
        int z = 6;
        System.out.println(catsAndMouse(x,y,z));
    }
    static String catsAndMouse(int x, int y, int z){
        int distance1 = 0; // distance between x and y
        int distance2 = 0; // distance between y and z


        // it is alternative for abs build in function

        if (x <= z)
            distance1 = z - x;
        else
            distance1 = x - z;


        if (y <= z)
            distance2 = z - y;
        else
            distance2 = y - z;


        if (distance1 == distance2)
            return "Mouse c";
        else if(distance1 < distance2)
            return "Cat A";
        else
            return "Cat B";
    }
}
