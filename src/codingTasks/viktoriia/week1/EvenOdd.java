package codingTasks.viktoriia.week1;

public class EvenOdd {
    public static void main(String[] args) {
        EvenOrOdd(5, 6);
    }

    public static void EvenOrOdd(int num1, int num2) {
        if (num1 % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        if (num2 % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }
}
//Write a method which can identifies given number is even or odd.
//Ex:
//idenitify(5) -> "Odd"
//idenitify(6) -> "Even"