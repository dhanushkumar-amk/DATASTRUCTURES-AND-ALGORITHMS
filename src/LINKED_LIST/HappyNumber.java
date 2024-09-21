package LINKED_LIST;

// leetcode 202

// related to cyclic linkedList


public class HappyNumber {
    public static boolean isHappy(int n){
        int slow = n;
        int fast = n;

        do {

            slow = findSquare(slow); // move one steps
            fast = findSquare(findSquare(fast)); // move two steps

        }while (fast != slow);

        if (slow == 1)
            return true;
        else
            return false;

    }

    public static  int findSquare(int number){
        int answer = 0;

        while (number > 0){
            int rem = number % 10;
            answer += rem * rem;
            number = number / 10;
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }

}
