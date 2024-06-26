package SEARCHING.BINARYSEARCH;

public class SingleElementInSortedArray {

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,3,4,5,5};
        // System.out.println(singleElement(nums));
        System.out.println(SingleElement(nums));
    }



    // simple way
        static int singleElement(int[] nums){
        int xor = 0;
        for(int i = 0; i <nums.length ; i++) {
        xor = xor ^ nums[i];
    }
    return xor;
}

// another way using binary search
static int SingleElement(int[] nums){
        int n = nums.length;
        if(n == 1) return  nums[0];

        if(nums[0] != nums[1]) return  nums[0];
        if(nums[n-1] != nums[n-2]) return  nums[n-1];

        int low = 0;
        int high = n-1;
        while (low <= high){
            int mid = low + (high - low)/2;

            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]) return  nums[mid];

            if((nums[mid] % 2 == 1 && nums[mid] == nums[mid-1]) || (nums[mid] % 2==0 && nums[mid] == nums[mid + 1])) low = mid + 1;
            else  high = mid - 1;
        }
    return  -1;
    }

}

