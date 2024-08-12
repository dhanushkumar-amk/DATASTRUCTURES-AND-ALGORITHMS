// Write a program in C to display the table of a number and print the sum of all the multiples in it.

class MultiplicationTable {
    public static void main(String[] args) {
        int table = 5;
        int toEnd = 10;
        multiplicationTable(table, toEnd);
    }
    static void multiplicationTable(int table, int toEnd){
        int value = 1;
        int sum = 0;
        
        for(int i = 1; i < toEnd; i++){
            value = table * i;
            System.out.println("Value is " + value);
            sum += value;
        }
        System.out.println("The sum og all number between 1 to " + toEnd + " is :" + sum);
    }
}
