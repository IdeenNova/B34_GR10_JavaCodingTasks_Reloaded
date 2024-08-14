package codingTasks.olga.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveSomeValues {

//Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
public static void removeGreaterThan(List<Integer> numbers, int maxValue) {
    // Use removeIf to remove all elements greater than maxValue
    numbers.removeIf(number -> number > maxValue);
}

    public static void main(String[] args) {
        // Create a list with some integers
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 101, 150, 99, 100, 200));

        // Print the original list
        System.out.println("Original list: " + numbers);

        // Remove all values greater than 100
        removeGreaterThan(numbers, 100);

        // Print the updated list
        System.out.println("List after removing values greater than 100: " + numbers);
    }

}