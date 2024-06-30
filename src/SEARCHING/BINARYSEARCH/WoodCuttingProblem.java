package SEARCHING.BINARYSEARCH;

public class WoodCuttingProblem {

    public static void main(String[] args) {
        int[] treeHeight = {20,15,10,17};
        int target = 7;
        System.out.println(machineHeight(treeHeight, target));
    }

    static int findWoodCount(int[] treeHeight, int mid){
        int woodCount = 0;
        for (int i = 0; i < treeHeight.length; i++) {
            if(treeHeight[i] > mid) woodCount +=(treeHeight[i] - mid);
        }
        return woodCount;
    }

    static int machineHeight(int[] treeHeight, int target){
        // find max value
        int max = 0;
        for (int i = 0; i < treeHeight.length ; i++) {
            if(treeHeight[i] > max) max = treeHeight[i];
        }
        int low = 0;
        int high = max;
        int mid = 0;
        while(low <= high){
            mid = (low + high)/2;

           int woodCount = findWoodCount( treeHeight, mid);
           if(woodCount == target || low == mid) return mid;
           else if (woodCount < target) low = mid;
           else high = mid;
        }
        return -1;
    }
}
