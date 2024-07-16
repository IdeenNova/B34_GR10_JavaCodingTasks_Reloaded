package codingTasks.valeriy.week7;

import java.util.Arrays;

public class arraySortAscending {
    /*Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};*/


    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7, 11, 5, 15};

        System.out.println(Arrays.toString(sortingIntOrderOfArray(arr))); //testing solution #1

        System.out.println(Arrays.toString(sortingIntOrderOfArray2(arr))); //testing solution #2


    }


    //solution #1
    public static int[] sortingIntOrderOfArray(int[] nonSortedArray){

        int temp = 0;
        for (int i = 0; i < nonSortedArray.length; i++){
           for (int j = i+1; j < nonSortedArray.length; j++){
               if(nonSortedArray[j]<nonSortedArray[i]){
                   temp = nonSortedArray[i];
                   nonSortedArray[i]=nonSortedArray[j];
                   nonSortedArray[j]= temp;
               }
           }
        }

        return  nonSortedArray;
    }


//solution #2
    public static int[] sortingIntOrderOfArray2(int[] arr){

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length-1; j++){

                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }

        return   arr;
    }










}
