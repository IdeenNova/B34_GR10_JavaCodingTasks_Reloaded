package codingTasks.tahmina.week1;

public class DivideWithoutOperator {
    /*
Write a method that can divide two numbers without using division operator

*/
    public static void main(String[] args) {
        System.out.println(DivideWithoutOperator(10,2));

        int num1=10;
        int num2=2;
    }
    public static int DivideWithoutOperator(int num1, int num2){
        int count = 0;
        while (num1 >= num2) {
            num1 = num1 - num2;
            count++;

        }
        return count;
    }
}