package ARRAYS;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumK_PositiveAndNegative {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,1,4,2,3};
        int k = 3;

    }
    public static  int subArray(int[] arr, int k){

        int n = arr.length;

        Map<Integer, Integer>PresumMap = new HashMap<>();
        int sum =0;
        int maxLength = 0;
        for (int i = 0; i <n ; i++) {
            sum += arr[i];

            if(sum == k){
                maxLength = Math.max(maxLength, i + 1);
            }

            int remove = sum - k;

            if(PresumMap.containsKey(remove)){
                int length = i - PresumMap.get(remove);
                maxLength = Math.max(maxLength, length);
            }

            if (!PresumMap.containsKey(sum)){
                PresumMap.put(sum,i);
            }

        }

        return maxLength;
    }
}
