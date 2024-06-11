package codingTasks.valeriy.week3;
  /*
        Write a method that can check if a number is prime or not
     */

public class primeNumber {

    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


}
