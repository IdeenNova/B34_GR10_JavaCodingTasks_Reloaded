package codingTasks.valeriy.week2;

public class Number_SwapTwoNumbers {

    public static void main(String[] args) {
        swapNumbers(10,5);
    }



    public static void swapNumbers(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}



    /*
    Swap two variables' values without using a third variable
     */