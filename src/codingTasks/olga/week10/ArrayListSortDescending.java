package codingTasks.olga.week10;

import java.util.ArrayList;

public class ArrayListSortDescending {
    //Write a method that can sort the ArrayList in descending order without using the sort method

    public static void selectionSortDescending(ArrayList<Integer> list) {
        int n = list.size();

        // Perform Selection Sort for descending order
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                // Find the index of the maximum element
                if (list.get(j) > list.get(maxIndex)) {
                    maxIndex = j;
                }
            }
            // Swap the found maximum element with the element at index i
            if (maxIndex != i) {
                int temp = list.get(i);
                list.set(i, list.get(maxIndex));
                list.set(maxIndex, temp);
            }
        }
    }

    public static void main(String[] args) {
        // Create and populate the ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(64);
        numbers.add(25);
        numbers.add(12);
        numbers.add(22);
        numbers.add(11);

        // Print the list before sorting
        System.out.println("Before sorting: " + numbers);

        // Sort the list in descending order
        selectionSortDescending(numbers);

        // Print the list after sorting
        System.out.println("After sorting in descending order: " + numbers);
    }

}
