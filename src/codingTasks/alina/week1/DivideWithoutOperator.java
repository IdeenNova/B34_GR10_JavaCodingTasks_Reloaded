package codingTasks.alina.week1;

public class DivideWithoutOperator {

    public static void main(String[] args) {
        System.out.println(divisionWithoutOperator(18,6));


    }

    public static int divisionWithoutOperator (int num1, int num2){

        int count = 0;
        while (num1>=num2){
            num1-=num2;
            count++;
        }

        return count;
    }

}
 /*
Write a method that can divide two numbers without using division operator

 */