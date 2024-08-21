package codingTasks.valeriy.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveSomeValues {

//Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,101,6,7,500,8,9,999));


        System.out.println(numsLessThan100(nums));

    }

    public static List<Integer> numsLessThan100(List<Integer> youListOfIntegers){
        List<Integer> numsThatAreLessThan100 = new ArrayList<>();
        for (Integer eachInteger : youListOfIntegers) {
            if (eachInteger < 100) {
                numsThatAreLessThan100.add(eachInteger);
            }
        }
      return numsThatAreLessThan100;
    }




}