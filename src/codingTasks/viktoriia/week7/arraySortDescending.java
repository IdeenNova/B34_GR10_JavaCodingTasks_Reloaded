package codingTasks.viktoriia.week7;

import java.util.Arrays;

public class arraySortDescending {
    /*Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7};*/
    public static void main(String[] args) {
        int[] arrExample = {10, 20, 7, 8, 90};
        System.out.println(Arrays.toString(sortDescending(arrExample)));
    }

    public static int[] sortDescending(int[] arr) {
        for (int i = 0; i < arr.length; i++) { // make loop start from 0 and it's gonna go until the end off the array // it's iterate through one position at the time
            for (int j = 0; j < arr.length - 1; j++) {//run nested loop

                if (arr[j] < arr[j + 1]) { // compare current element with next element for descending order
                    int temp = arr[j]; // swap if the current element is less than the next element
                    arr[j] = arr[j + 1]; // set current position to the value of the next element
                    arr[j + 1] = temp; // set next position to the value of the current element
                }
            }
        }
        return arr;
    }


}
