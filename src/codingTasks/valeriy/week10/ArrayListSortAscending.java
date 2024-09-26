package codingTasks.valeriy.week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListSortAscending {
/*
Write a method that can sort the ArrayList in Ascending order without using
the sort method.
 */


    public class CustomSort {
        public static void bubbleSort(ArrayList<Integer> list) {
            int n = list.size();
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    // Swap if the current element is greater than the next element
                    if (list.get(j) > list.get(j + 1)) {
                        int temp = list.get(j);
                        list.set(j, list.get(j + 1));
                        list.set(j + 1, temp);
                    }
                }
            }
        }

    }
}