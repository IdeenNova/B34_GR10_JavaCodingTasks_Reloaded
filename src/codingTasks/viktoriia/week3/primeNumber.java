package codingTasks.viktoriia.week3;

public class primeNumber {
     /*
        Write a method that can check if a number is prime or not
      // Prime number - a number that is divisible only by 1 and itself
      Ex: - 2,3,5,7,11,13
     */
     public static void main(String[] args) {
          int num = 14;
          int count = 0;

          for (int i = 1; i<=num; i++){
               if (num % i == 0){
                    count++;
               }
          }

          if (count == 2){
               System.out.println("Prime");
          } else {
               System.out.println("Not prime");
          }

     }


}
