package ARRAYS;

public class CountsmallerOrequalTotargetInarrys {
    public static void main(String[] args) {
//        int nums[] = {2,6,12,18,21,26,33,42};
//        int nums[] = {2,6,12,18,21,26,26,26};
        int nums[] = {2,6,12,18,21,26,26};

        System.out.println(CountElements(nums, 25));
    }
    static int CountElements(int[] nums, int target){
        // Binary Search

     int start = 0;
     int end = nums.length-1;
     int mid = 0;
     while(start <= end){
         mid  = start + (end - start) / 2;
             if(target== nums[mid])
             {

                 // if the element contains duplicates then mid + 1
                 while ( mid+1 < nums.length && nums[mid+1] == target){
                     mid++;
                 }

                 break;
             } else if (target < nums[mid]) {
                 end = mid - 1;
             }
             else {
                 start = mid + 1;
             }
         }
         if(nums[mid] > target){
         return  mid;
          }
          else {
            return mid + 1;
          }
      }

    }
