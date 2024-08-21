package codingTasks.viktoriia.week11;

import java.util.HashMap;
import java.util.Map;

public class MapMinValue {
    //Write a method that can return the minimum value from a map (DO NOT use sort method)

    public static int findMinValue(Map<String, Integer> map) {
        // Initialize a variable to store minimum value, starting with the maximum possible integer value
        int minValue = Integer.MAX_VALUE;

        // Iterate over the values in the map
        for (int value : map.values()) {
            // If the current value is less than minValue, update minValue
            if (value < minValue) {
                minValue = value;
            }
        }

        return minValue;
    }

    public static void main(String[] args) {
        Map<String, Integer> exampleMap = new HashMap<>();
        exampleMap.put("A", 10);
        exampleMap.put("B", 3);
        exampleMap.put("C", 8);
        exampleMap.put("D", 15);

        int minValue = findMinValue(exampleMap);
        System.out.println("The minimum value in the map is: " + minValue);
    }
}
