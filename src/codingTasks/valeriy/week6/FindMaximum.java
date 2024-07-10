package codingTasks.valeriy.week6;

public class FindMaximum {
    //Write a method that can find the maximum number from an int Array


    public static void main(String[] args) {
        int[] arrInt = {2,4,88,7,12,7,0,-22,55,107};
        System.out.println(maxNumber(arrInt));

    }


    public static int maxNumber(int[] arrInt){
        int maxNumber = 0;
        for (int each : arrInt) {
            if(maxNumber<each){
                maxNumber=each;
            }
        }
        return maxNumber;
    }

}
