package codingTasks.olga.week11;

import java.util.HashMap;
import java.util.Map;

public class MapMinValue {
    //Write a method that can return the minimum value from a map (DO NOT use sort method)
    public static void main(String[] args) {
        // Example usage
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 10);
        map.put("b", 5);
        map.put("c", 20);
        map.put("d", 1);

        Integer minValue = findMinimumValue(map);
        if (minValue != null) {
            System.out.println("The minimum value in the map is: " + minValue);
        } else {
            System.out.println("The map is empty.");
        }
    }

    public static Integer findMinimumValue(Map<String, Integer> map) {
        // Handle empty map case
        if (map == null || map.isEmpty()) {
            return null; // Or throw an exception, depending on your needs
        }

        // Initialize the minimum value to a large number
        Integer minValue = Integer.MAX_VALUE;

        // Iterate through the map entries
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();
            if (value < minValue) {
                minValue = value;
            }
        }

        return minValue;
    }



}
