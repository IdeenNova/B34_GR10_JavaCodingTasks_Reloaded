package codingTasks.viktoriia.week7;

public class arrayFindMinimum {
    // Write a method that can find the minimum  number from an int Array
    public static void main(String[] args) {
        int[] arr = {45, 12, -9, 1,-5, 0, 5};
        System.out.println(minNum(arr));
    }

    public static int minNum(int[] arr){
        int min = arr[0]; // as a start point
         // for each loop, because i don't care about indexes (I just want read the value and compare)
        for (int each : arr){
            if (each < min){
                min = each;
            }
        }
     return min;

    }
}
