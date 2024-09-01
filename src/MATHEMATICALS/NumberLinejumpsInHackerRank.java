package MATHEMATICALS;

public class NumberLinejumpsInHackerRank {
    public static void main(String[] args) {
        int kangaroo1 = 2;
        int distance1 = 1;
        int kangaroo2 = 5;
        int distance2 = 3;
        Kangaroo(kangaroo1, kangaroo2, distance1, distance2);
    }
    public static String Kangaroo(int kangaroo1, int distance1, int kangaroo2, int distance2){
        
       // base condition
        if (distance1 < distance2)
            return "No";

        int newKangaroo1Position = kangaroo1;
        int newKangaroo2Position = kangaroo2;

        while(newKangaroo1Position < newKangaroo2Position) {
            newKangaroo1Position += distance1;
            newKangaroo2Position += distance2;

            if (newKangaroo1Position == newKangaroo2Position)
                return "yes";
        }
        return  "no";
    }
}
