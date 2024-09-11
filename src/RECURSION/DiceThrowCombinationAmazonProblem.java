package RECURSION;

public class DiceThrowCombinationAmazonProblem {
    public static void main(String[] args) {
        diceCombination("", 4);
    }

    static void diceCombination(String p, int target){

        // base case
        if(target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            diceCombination(p + i, target - i);
        }
    }
}
