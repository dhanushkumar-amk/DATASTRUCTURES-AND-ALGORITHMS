Package.Arrays;
import java.io.*;
 
class CountVally {
    static int countValleys(int n, int arr[]){
   int count = 0; 
   int temp = 0;
   
   for(int i = 1; i < n-1;i++){
       if(arr[i -1 ] > arr[i] && arr[i] < arr[i+1]) count++;
   }
   return count;
    }
    
 public static void main(String[] args)
    {
        int arr[] = { 3, 2, 5,3,7 };
        int n = arr.length;
        System.out.println(
            countValleys(n, arr));
    }
}

