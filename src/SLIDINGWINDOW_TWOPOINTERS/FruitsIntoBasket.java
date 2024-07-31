package SLIDINGWINDOW_TWOPOINTERS;

import java.util.HashMap;
import java.util.Map;

public class FruitsIntoBasket {
    public static void main(String[] args) {
        int[] fruits = {1,2,1,1,3,4,2,2,2,2,4};
        int k  = 2;
        System.out.println(fruitsIntoBasket(fruits, k));
    }

    public  static  int fruitsIntoBasket(int[] fruits, int k){

        Map<Integer, Integer> basket = new HashMap<>();
        int left = 0;
        int right = 0;
        int maxFruit = 0;

        for (int i = 0; i <fruits.length ; i++) {
            int currentCount = basket.getOrDefault(fruits[right], 0); // getOrDefault function returns get the particular function and also set the default value
            basket.put(fruits[right], currentCount + 1);


            while(basket.size() > 2){
                int fruitCount = basket.get(fruits[left]);

                if(fruitCount == 1)
                    basket.remove(fruits[left]);
                else
                    basket.put(fruits[left], fruitCount - 1);

                left++;
            }
            maxFruit = Math.max(maxFruit, right - left + 1);
        }
        return  maxFruit;
    };
}
