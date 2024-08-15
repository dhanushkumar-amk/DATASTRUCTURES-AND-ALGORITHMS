package ARRAYS;

public class LemonadeCharge {
    public static void main(String[] args) {
        int[] bills = {5,5,5,10,30};
        System.out.println(change(bills));
    }
    static  boolean change(int[] bills){

        int twentyDollars = 0;
        int tenDollars = 0;
        int fiveDollars = 0;

        for(int bill : bills){

            int amount = bill - 5;

            int twentyDollarNeeded = Math.min(amount / 20 , twentyDollars);
            amount -= (twentyDollarNeeded * 20);
            twentyDollars -= twentyDollarNeeded;

            int tenDollarNeeded = Math.min(amount / 10 , tenDollars);
            amount -= (tenDollarNeeded * 10);
            tenDollars -= tenDollarNeeded;

            int fiveDollarNeeded = Math.min(amount / 5 , fiveDollars);
            amount -= (fiveDollarNeeded * 5);
            fiveDollars -= fiveDollarNeeded;


            if(amount > 0)
                return  false;

            if(bill == 20)
                twentyDollars++;
            else if(bill == 10)
                tenDollars++;
            else
                fiveDollars++;
        }
        return  true;
    }
}
