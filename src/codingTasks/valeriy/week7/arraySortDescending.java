package codingTasks.valeriy.week7;

import java.util.Arrays;

public class arraySortDescending {
  /*Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7};*/

    public static int[] sortingIntDescendingOrder(int[] nonSortedArray){

        int temp = 0;
        for (int i = 0; i < nonSortedArray.length; i++){
            for (int j = i+1; j < nonSortedArray.length; j++){
                if(nonSortedArray[j]>nonSortedArray[i]){
                    temp = nonSortedArray[i];
                    nonSortedArray[i]=nonSortedArray[j];
                    nonSortedArray[j]= temp;
                }
            }
        }

        return  nonSortedArray;
    }


    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7, 11, 5, 15, 44, 19};
        System.out.println((Arrays.toString(sortingIntDescendingOrder(arr))));
    }



}
