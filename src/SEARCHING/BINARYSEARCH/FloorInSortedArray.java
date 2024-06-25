package SEARCHING.BINARYSEARCH;

public class FloorInSortedArray {
    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50};
        int target = 25;
        System.out.println(floor(nums,target));
    }
    static  int floor(int[] nums, int target){
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int answer = -1;

        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] <= target){
                answer = nums[mid];
                low = mid + 1;
            }
            else high = mid - 1;
        }
        return answer;
    }
}
