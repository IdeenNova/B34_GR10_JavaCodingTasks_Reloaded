package codingTasks.viktoriia.week4;

public class RemoveDuplicates {
     /*Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC*/

    public static void main(String[] args) {


        String s = "AAABBBCCC";
        String unique = "";

        for (int i = 0; i < s.length(); i++) {
            if (!unique.contains("" + s.charAt(i))) {
                unique += s.charAt(i);
            }
        }

        System.out.println("unique = " + unique);
    }
}
