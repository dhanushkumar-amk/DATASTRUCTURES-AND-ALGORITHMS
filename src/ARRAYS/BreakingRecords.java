package ARRAYS;

import java.util.ArrayList;

public class BreakingRecords {
    public static void main(String[] args) {
        int[] scores = {10,5,20,20,4,5,2,25,1};

    }

    static ArrayList<Integer> count(int[] scores){

        int max = scores[0];
        int min = scores[0];

        int maxCount = 0;
        int minCount = 0;

        for (int i = 1; i < scores.length ; i++) {
            if (scores[i] > max) {
                max = scores[i];
                maxCount++;
            }

            if (scores[i] < min) {
                min = scores[i];
                minCount++;
            }
        }
      ArrayList<Integer> result =  new ArrayList<>();
        result.add(maxCount);
        result.add(minCount);
        result
    }

}
