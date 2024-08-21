package codingTasks.valeriy.week6;

public class sumOfDigits {

 //Write a method that can return the sum of the digits in a string

    public static void main(String[] args) {
        System.out.println(sumOfDigitsInString("qwer1235qwe"));


    }



    public static int sumOfDigitsInString(String stringWithDigits) {
        int sum = 0;
        for (char eachChar : stringWithDigits.toCharArray()) {
            if (Character.isDigit(eachChar)) {
                sum += Character.getNumericValue(eachChar);
            }
        }
        return sum;
    }

}
