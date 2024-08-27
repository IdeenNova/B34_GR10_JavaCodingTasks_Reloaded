package codingTasks.madina.week9;

import java.util.Arrays;

public class concat2Arrays {

    public static void main(String[] args) {
        // Declare and assign an array
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};

        // Define the length
        int lengthArr1 = arr1.length;
        int lengthArr2 = arr2.length;

        //define a new array that will store the concatenation of the two arrays
        int[] result = new int[lengthArr1+lengthArr2];

        //call a built in function System.arraycopy which takes 5 argument
        System.arraycopy(arr1,0,result,0,lengthArr1);
        System.arraycopy(arr2, 0,result, lengthArr1, lengthArr2);

        System.out.println(Arrays.toString(result));
    }

//Write a return method that can concate two arrays





}
