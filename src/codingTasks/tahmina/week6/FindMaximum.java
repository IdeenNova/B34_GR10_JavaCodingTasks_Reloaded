package codingTasks.tahmina.week6;

public class FindMaximum {

    //Write a method that can find the maximum number from an int Array

    public static void main(String[] args) {
        // Example usage:
        int[] array = {3, 9, 1, 7, 4, 6};
        int maximum = findMaximum(array);
        System.out.println("Maximum number in the array: " + maximum);
    }

    // Method to find the maximum number in an int array
    public static int findMaximum(int[] arr) {
        // Check if the array is not null and has at least one element
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Input array must not be empty or null");
        }

        // Initialize max to the first element of the array
        int max = arr[0];

        // Iterate through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // Update max if current element is greater than max
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Return the maximum number found in the array
        return max;
    }
}