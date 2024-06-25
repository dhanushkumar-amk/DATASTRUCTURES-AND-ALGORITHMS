package SEARCHING.LINERARSEARCH;
// https://leetcode.com/problems/richest-customer-wealth/
public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {4,5,1},
                {1,3,3}
        };
        int ans = maximumWealth(accounts);
        System.out.println(ans);

    }
    public static int maximumWealth(int[][] accounts){
        // person = row
        // accounts = column
int max = Integer.MIN_VALUE;
        for (int person = 0; person <accounts.length ; person++) {
            int rowSum = 0;
            for (int account = 0; account < accounts[person].length ; account++) {
                rowSum += accounts[person][account];
            }
            if(rowSum > max){
                max= rowSum;
            }
        }
        return max;
    }
}
