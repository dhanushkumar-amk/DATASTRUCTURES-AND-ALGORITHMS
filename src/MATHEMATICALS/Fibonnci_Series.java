package MATHEMATICALS;

public class Fibonnci_Series {
    public static void main(String[] args) {
        int n = 9;


     if(n <= 1)
         System.out.println(n);

     int[] map = new int[n + 1];

     map[0] = 0;
     map[1] = 1;
        System.out.println(map[0] + " " );
        System.out.println(map[1] + " " );
        for (int i = 2; i <= n ; i++) {
            map[i] = map[i -1] + map[i-2];
            System.out.println(
                    map[i]);
        }
    }
}


