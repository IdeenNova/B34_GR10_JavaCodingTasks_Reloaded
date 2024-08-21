package codingTasks.olga.week10;

import java.util.*;

public class MapSortByValues {

    //Write a method that can sort the Map by values

    public static <K, V extends Comparable<V>> Map<K, V> sortByValues(Map<K, V> map) {
        // Convert the map entries to a list
        List<Map.Entry<K, V>> entryList = new ArrayList<>(map.entrySet());

        // Sort the list by values (ascending order)
        entryList.sort(Map.Entry.comparingByValue());

        // Create a LinkedHashMap to maintain insertion order
        Map<K, V> sortedMap = new LinkedHashMap<>();

        // Populate the LinkedHashMap with the sorted entries
        for (Map.Entry<K, V> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }

    public static void main(String[] args) {
        // Create and populate the Map
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 3);
        map.put("banana", 1);
        map.put("cherry", 2);

        // Print the map before sorting
        System.out.println("Before sorting: " + map);

        // Sort the map by values
        Map<String, Integer> sortedMap = sortByValues(map);

        // Print the sorted map
        System.out.println("After sorting by values: " + sortedMap);
    }

}
