package codingTasks.olga.week10;

import java.util.ArrayList;

public class ArrayListSortAscending {
/*
Write a method that can sort the ArrayList in Ascending order without using
the sort method.
 */
public static void bubbleSort(ArrayList<Integer> list) {
    int n = list.size();
    boolean swapped;

    // Perform Bubble Sort
    for (int i = 0; i < n - 1; i++) {
        swapped = false;
        for (int j = 0; j < n - 1 - i; j++) {
            if (list.get(j) > list.get(j + 1)) {
                // Swap the elements
                int temp = list.get(j);
                list.set(j, list.get(j + 1));
                list.set(j + 1, temp);
                swapped = true;
            }
        }
        // If no two elements were swapped by inner loop, then break
        if (!swapped) break;
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

        // Sort the list
        bubbleSort(numbers);

        // Print the list after sorting
        System.out.println("After sorting: " + numbers);
    }

}

