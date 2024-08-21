package codingTasks.madina.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveSomeValues {

    public static void main(String[] args) {

            // Sample list of integers
            List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 101, 150, 200));

        System.out.println("Before:" + numbers);

            // Using an iterator to remove elements greater than 100
            Iterator<Integer> iterator = numbers.iterator();
            while (iterator.hasNext()) {
                if (iterator.next() > 100) {
                    iterator.remove();
                }
            }

            // Output the modified list
            System.out.println("After:" + numbers);
        }

    }

//Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.

