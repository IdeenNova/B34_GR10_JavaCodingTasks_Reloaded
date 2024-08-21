package codingTasks.valeriy.week9;

import java.util.Arrays;

public class concat2Arrays {

//Write a return method that can concate two arrays

    public static int[] concatenate(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];


        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            result[index++] = array1[i];
        }


        for (int i = 0; i < array2.length; i++) {
            result[index++] = array2[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 5, 7};
        int[] arr2 = {6, 9, 11,14};

        int[] concatenatedArray = concatenate(arr1, arr2);


        System.out.println((Arrays.toString(concatenatedArray)));

    }

}
