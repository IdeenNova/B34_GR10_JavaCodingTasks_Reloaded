package codingTasks.iryna.week1;

public class DivideWithoutOperator {
    /*
Write a method that can divide two numbers without using division operator

*/
    public static void main(String[] args) {

        System.out.println(divisionWithoutOperator(10, 2));
    }
    public static Integer divisionWithoutOperator (int num1, int num2) {

        int count = 0;
        while (num1 >= num2){
            num1 -= num2;
            count++;
        }
        return count;
    }
}