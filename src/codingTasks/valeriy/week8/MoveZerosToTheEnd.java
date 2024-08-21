package codingTasks.valeriy.week8;

import java.util.Arrays;

public class MoveZerosToTheEnd {
    /*Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
Ex:
input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]*/

   public static int[] moveAllZeroToRight(int[] array){
     if(array.length==1){
         return array;
     }

     int[] newArray = new int[array.length];

    int count =0;
     for(int number: array){
         if(number!=0)
             newArray[count] =number;
         count++;
     }

   return newArray;

   }


    public static void main(String[] args) {
        int[] i = new int[] {1, 2, 3, 4, 0, 0, 0, 0};
        System.out.println(Arrays.toString(moveAllZeroToRight(i)));

    }



}
