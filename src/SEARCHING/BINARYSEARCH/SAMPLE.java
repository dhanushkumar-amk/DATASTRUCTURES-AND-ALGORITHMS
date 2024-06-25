package SEARCHING.BINARYSEARCH;

public class SAMPLE {

    public static void main(String[] args) {
        int[] nums = {22,33,44,55,66,77,78,88,99};
        int target = 78;
        System.out.println(searchBinary(nums,target));
    }

    static int searchBinary(int[] nums, int target){
        int n = nums.length;
        int low = 0;
        int high = n-1;

        while(low <= high){
            int mid = (low + high)/2;
            if(target == nums[mid]) return  mid;
            else if (target >= nums[mid]) low = mid+1;
            else high = mid-1;
        }
        return  -1;
    }
}

// Binary search is the efficient way to search the element iin the given array

//binary search is use only on the sorted array

// time complexity of the binary search => O(log n)
