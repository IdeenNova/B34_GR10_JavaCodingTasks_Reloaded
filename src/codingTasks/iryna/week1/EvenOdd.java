package codingTasks.iryna.week1;


public class EvenOdd {
    /*
Write a method which can identifies given number is even or odd.
Ex:
idenitify(5) -> "Odd"
idenitify(6) -> "Even"
*/

    public static void main(String[] args) {

        evenOrOdd(5);

    }
    public static void evenOrOdd (int num){
        if(num % 2 == 0){
            System.out.println(num + " even");
        }else {
            System.out.println(num + " odd");
        }
    }
}