package ARRAYS;

//import java.util.ArrayList;

import java.util.Arrays;

public class CompareTripletsInHackerRank {
    public static void main(String[] args) {
        int[] alice = {3,6,7};
        int[] bob = {3,6,10};
        System.out.println(Arrays.toString(Triplets(alice, bob)));
    }
    static int[] Triplets(int[] alice, int[] bob){

        int[] result = new int[2];
        int Alice = 0;
        int Bob = result.length-1;

        for (int i = 0; i < 3 ; i++) {
            if (alice[i] > bob[i]) {
                result[Alice]++;

            }
            else if (alice[i] < bob[i]) {
                result[Bob]++;
            }
        }
    return result;
    }
}
