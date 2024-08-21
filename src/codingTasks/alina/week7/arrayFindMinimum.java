package codingTasks.alina.week7;

public class arrayFindMinimum {
    // Write a method that can find the minimum  number from an int Array


    public static void findMinimumArray() {
        int[] arr = {3, 6, 8, 14, 18, 25, 76, 98};
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println(min);
    }
    public static void main(String[] args) {
        findMinimumArray();
    }
}


