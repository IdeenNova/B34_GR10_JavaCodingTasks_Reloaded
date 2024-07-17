package codingTasks.valeriy.week7;

import java.util.Arrays;

public class arrayFindMinimum {
    // Write a method that can find the minimum  number from an int Array

public static void findMinNumOfArray(int[] myArray){
    int minimumNumber= myArray[0];
    for(int i = 0; i <myArray.length;i++){
        if(myArray[i]<minimumNumber){
          minimumNumber=myArray[i];
        }
    }
    System.out.println("A minimal minber of your array is = " + minimumNumber);
}


    public static void main(String[] args) {
        int[] myArray = {3, 5, 8, 2, 9, 11, -5};
        findMinNumOfArray(myArray);
    }

}
