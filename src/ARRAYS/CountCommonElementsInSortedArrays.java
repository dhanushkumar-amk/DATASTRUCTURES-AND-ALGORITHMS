import java.io.*;
 
class CountCommonElementsInSortedArrays{
  public static int countEqual(int[] a, int[] b, int n){
   int count = 0;
   for(int i = 0; i < n; i++){
       for(int j = 0; j< n; j++){
       if(a[i] == b[j]) {
           count++;
           break;
           }
       }
   }
  return count;
 }
 
 
  public static void main(String[] args)
  {
    int[] a = {2, 4, 5, 8, 12, 13, 17, 18, 20, 22, 309, 999};
    int[] b = {109, 99, 68, 54, 22, 19, 17, 13, 11, 5, 3, 1};
    int n = a.length;
    System.out.print(countEqual(a, b, n));
  }
} 
