package codingTasks.viktoriia.week11;

import java.util.HashMap;
import java.util.Map;

public class MapFrequencyOFCharacters {
  //  Write a method that prints the frequency of each character from a String.
  public static void printCharacterFrequency(String input) {
      //  Create a HashMap for storing the frequency of each character
      Map<Character, Integer> frequencyMap = new HashMap<>();

      // Convert the input string to a character array
      char[] characters = input.toCharArray();

      // Iterate over the character array
      for (char c : characters) {
          // If the character is already in the map, increment its count
          if (frequencyMap.containsKey(c)) {
              frequencyMap.put(c, frequencyMap.get(c) + 1);
          } else {
              // Otherwise, add the character to the map with a count of 1
              frequencyMap.put(c, 1);
          }
      }

      // Print the frequency of each character
      for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
          System.out.println("Character '" + entry.getKey() + "' appears " + entry.getValue() + " time(s).");
      }
  }

    public static void main(String[] args) {
        String input = "example";
        printCharacterFrequency(input);
    }

}
