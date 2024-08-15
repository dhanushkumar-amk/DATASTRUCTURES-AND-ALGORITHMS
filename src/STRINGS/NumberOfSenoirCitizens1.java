package STRINGS;

public class NumberOfSenoirCitizens1 {
    public static void main(String[] args) {
        String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        System.out.println(noOfCitizens(details));
    }
    static  int noOfCitizens(String[] details){
        int count = 0;
        for (int i = 0; i <details.length ; i++) {
            String s = details[i].substring(11,13);
            if(Integer.parseInt(s) > 60)
                count++;
        }
        return  count;
    }
}
