package codingTasks.tahmina.week1;


public class EvenOdd {
    /*
Write a method which can identifies given number is even or odd.
Ex:
idenitify(5) -> "Odd"
idenitify(6) -> "Even"
*/
    public static void oddEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even number");
        } else {
            System.out.println(num + " is odd number");
        }


    }
}
