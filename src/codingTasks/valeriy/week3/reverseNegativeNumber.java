package codingTasks.valeriy.week3;

//Write a return method that can reverse negative number and return it as int
//ex: given int is ==> -53
//  the output will be ==> -35

public class reverseNegativeNumber {

    public static void main(String[] args) {
        int number = -53;
        int reversedNumber = revereNumber(number);
        System.out.println("Reversed number: " + reversedNumber);
    }





    public static int revereNumber(int number){

        String str = Integer.toString(number);
        String reversedStr = "";


        if (str.charAt(0) == '-') {
            reversedStr += '-';

            for (int i = str.length() - 1; i > 0; i--) {
                reversedStr += str.charAt(i);
            }
        } else {

            for (int i = str.length() - 1; i >= 0; i--) {
                reversedStr += str.charAt(i);
            }
        }

        return Integer.parseInt(reversedStr);
    }


}
