package codingTasks.valeriy.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAhmed {

    /*Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed
    */

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Ahmed","John", "Eric", "Ahmed", "Vasiliy", "Ahmed", "Boris Moiseev"));

        System.out.println(names);
        System.out.println(removeAhmedMethod(names));

    }



    public static List<String> removeAhmedMethod(List<String> youListOfNames){
        List<String> namesWithOutAhmed = new ArrayList<>();

        for (String eachName : youListOfNames) {
            if(!eachName.contains("Ahmed")) {
                namesWithOutAhmed.add(eachName);
            }
        }
        return namesWithOutAhmed;

    }


}
