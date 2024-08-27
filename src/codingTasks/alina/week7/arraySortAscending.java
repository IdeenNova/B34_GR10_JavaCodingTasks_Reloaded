package codingTasks.alina.week7;

public class arraySortAscending {

    /*Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};*/

    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7, 11, 5, 15};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0; //temporary storage when swapping the elements
                if (arr[i] > arr[j]) {//checks if current i is greater then j
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        // Print the sorted array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}



