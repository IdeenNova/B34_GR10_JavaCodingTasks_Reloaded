package codingTasks.madina.week9;

import java.util.*;

public class RemoveAhmed {
    public static void main(String[] args) {

        //Declare list veriable
        List<String> list = new ArrayList<>();
        list.add("Ahmed");
        list.add("John");
        list.add("Eric");
        list.add("Ahmed");

        System.out.println("Before:" + list);

        //remove duplicate using remove method
        //list.remove("Ahmed");
        //Also we can use Set which handles only uniqie elements and doesn't eccept duplicate
        Set<String> set = new LinkedHashSet<>(list);

        // clear before adding to the new data
        list.clear();

        System.out.println("After:" + list);

        //convert the list into the set object
        list.addAll(set);
        System.out.println("After:" + list);

    }

    /*Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed
    */

}
