package SEARCHING.BINARYSEARCH;

public class KOKOEatingBanana {
    public static int findMax(int[] v) {
        int maxi = Integer.MIN_VALUE;;
        int n = v.length;
        //find the maximum:
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, v[i]);
        }
        return maxi;
    }

    public static int calculateTotalHours(int[] v, int hourly) {
        int totalH = 0;
        int n = v.length;
        //find total hours:
        for (int i = 0; i < n; i++) {
            totalH += Math.ceil((double)(v[i]) / (double)(hourly));
        }
        return totalH;
    }

    public static int minimumRateToEatBananas(int[] v, int h) {
        int low = 1, high = findMax(v);

        //apply binary search:
        while (low <= high) {
            int mid = (low + high) / 2;
            int totalH = calculateTotalHours(v, mid);
            if (totalH <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] v = {7, 15, 6, 3};
        int h = 8;
        int ans = minimumRateToEatBananas(v, h);
        System.out.println("Koko should eat at least " + ans + " bananas/hr.");
    }



}

/*

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        long sum = 0;
        for (int n : piles) {
            sum += n;
        }
        int min = (int) Math.ceilDiv(sum, h);
        int max = (int) Math.ceilDiv(sum, h - piles.length + 1);
        int mid = 0;
        while (min < max) {
            mid = (max + min)/2;
            int time = 0;
            for (int i : piles) {
                time += (i + mid - 1)/mid;
                if (time > h) {
                    break;
                }
            }
            if (time > h) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }
        return max;
    }
}*/