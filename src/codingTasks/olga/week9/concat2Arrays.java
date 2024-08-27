package codingTasks.olga.week9;

public class concat2Arrays {

//Write a return method that can concate two arrays

    public static int[] concatenate(int[] array1, int[] array2) {
        // Create a new array to hold the concatenated result
        int[] result = new int[array1.length + array2.length];

        // Copy elements from the first array
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            result[index++] = array1[i];
        }

        // Copy elements from the second array
        for (int i = 0; i < array2.length; i++) {
            result[index++] = array2[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int[] concatenatedArray = concatenate(array1, array2);

        // Print the concatenated array
        for (int i : concatenatedArray) {
            System.out.print(i + " ");
        }
    }

}
