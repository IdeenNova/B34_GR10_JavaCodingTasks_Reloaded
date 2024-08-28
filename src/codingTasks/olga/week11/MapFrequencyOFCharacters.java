package codingTasks.olga.week11;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapFrequencyOFCharacters {
  //  Write a method that prints the frequency of each character from a String.

    public static void main(String[] args) {
        // Example usage
        String input = "hello world";
        printCharacterFrequency(input);
    }

    public static void printCharacterFrequency(String str) {
        // Handle null or empty string case
        if (str == null || str.isEmpty()) {
            System.out.println("String is null or empty.");
        }

        // Create a HashMap to store character frequencies
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Convert the string to a char array
        char[] characters = str.toCharArray();

        // Iterate over the char array
        for (char c : characters) {
            // Skip if the character is a space or not printable
            if (Character.isWhitespace(c) || !Character.isLetterOrDigit(c)) {
                continue;
            }
            // Update the frequency count in the HashMap
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        // Print the frequency of each character
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
