
public class CountPairsWithGivenSum {
    public static void main(String args[])
    {
        int[] arr = { 1, 5, 7, -1, 5 };
        int target = 6;
        getPairsCount(arr, target);
    }


    public static void getPairsCount(int[] arr, int target)
    {
     int count = 0;
     for(int i =0; i < arr.length; i++)
        for(int j =i+1; j<arr.length; j++)
            if((arr[i] + arr[j]) == target)
                count++;
        System.out.printf("Count of pairs is %d", count);
    }
}
