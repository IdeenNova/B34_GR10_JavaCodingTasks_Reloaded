package codingTasks.valeriy.week1;

public class EvenOdd {

    public static void oddEven(int num){
        if (num%2==0){
            System.out.println(num+" is even number");
        } else {
            System.out.println(num+" is odd number");
        }
    }


}
//Write a method which can identifies given number is even or odd.
//Ex:
//idenitify(5) -> "Odd"
//idenitify(6) -> "Even"