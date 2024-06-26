package SEARCHING.BINARYSEARCH;

public class SingleElementInSortedArray {

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,4,4,5,5};
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


        return;
}

}

