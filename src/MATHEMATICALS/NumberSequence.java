// write the program that get four input current number, current sum, previous number, previous sum and returns the that three in every iterfation
// write the program that get four input current number, current sum, previous number, previous sum and returns the that three in every iterfation



public class NumberSequence {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        int currentNumber;
        int previousNumber = 0;
        int currentSum = 0;
        int previousSum = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            currentNumber = numbers[i];
            currentSum += currentNumber;
            
            System.out.println("Current Number: " + currentNumber);
            System.out.println("Previous Number: " + previousNumber);
            System.out.println("Current Sum: " + currentSum);
            System.out.println("Previous Sum: " + previousSum);
            System.out.println();
            
            previousNumber = currentNumber;
            previousSum = currentSum;
        }
    }
}
