package ARRAYS;

import java.util.ArrayList;

public class AppleAndOranges {
    public static void main(String[] args) {
        ArrayList<Integer> apples = new ArrayList<>();
        ArrayList<Integer> oranges = new ArrayList<>();

        apples.add(2);
        apples.add(4);
        apples.add(-1);
        apples.add(7);

        oranges.add(2);
        oranges.add(-2);
        oranges.add(-7);


        int s = 7;
        int t = 11;

        int a = 4;
        int b = 12;
        countAppleAndOrange(s,t,a,b,apples,oranges);
    }

    static  void countAppleAndOrange(int s, int t, int a, int b, ArrayList<Integer> apples, ArrayList<Integer> oranges){

        int appleCount = 0;
        int orangeCount = 0;

        for (int i = 0; i <apples.size()-1 ; i++) {
            if (a + apples.get(i) >= s && a + apples.get(i) <= t)
                appleCount++;
        }


        for (int i = 0; i <oranges.size()-1 ; i++) {
            if (b + oranges.get(i) >= s && b+oranges.get(i) <= t)
                orangeCount++;
        }


        System.out.println(appleCount);
        System.out.println(orangeCount);
    }
}
