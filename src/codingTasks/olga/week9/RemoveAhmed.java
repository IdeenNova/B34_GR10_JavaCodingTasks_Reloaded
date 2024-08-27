package codingTasks.olga.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAhmed {

    /*Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed
    */
    public static void removeName(List<String> names, String nameToRemove) {
        // Use removeIf to remove all occurrences of nameToRemove
        names.removeIf(name -> nameToRemove.equals(name));
    }

    public static void main(String[] args) {
        // Create a list with some names
        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Alice", "Ahmed"));

        // Print the original list
        System.out.println("Original list: " + names);

        // Remove all occurrences of "Ahmed"
        removeName(names, "Ahmed");

        // Print the updated list
        System.out.println("List after removing 'Ahmed': " + names);
    }

}
