package SEARCHING.BINARYSEARCH;

public class SearchInsertPosition {
// same code as well as lower bound program
    public static void main(String[] args) {
        int[] nums = {1,2,4,7};
        int value = 6;
        int n = 4;
        System.out.println(insertPosition(nums,value,n));
    }
    static int insertPosition(int[] nums, int value, int n){
        int low = 0;
        int high = n-1;
        int answer  = n;

        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] >= value){
                answer = mid;
                high = mid - 1;
            }
            else  low = mid + 1;
        }
        return  answer;
    }
}
