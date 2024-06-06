package codingTasks.viktoriia.week1;


public class DivideWithoutOperator {
    public static void main(String[] args) {
        divide(16, 3);
    }


    public static void divide(int num1, int num2) {

        int count = 0;
        while (num1 > num2) {
            count++;
            num1 -= num2;
        }
        System.out.println(count);
    }
}

// Write a method that can divide two numbers without using division operator