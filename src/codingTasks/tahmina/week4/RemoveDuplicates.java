package codingTasks.tahmina.week4;

public class RemoveDuplicates {
     /*Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC*/

    public static void main(String[] args) {
        System.out.println("removeDuplicateMethod(\"CCCBDCCDD\") = " + removeDuplicateMethod("CCCBDCCDD"));
    }


    public static String removeDuplicateMethod(String str){
        String str2 = "";
       char[] arrStr =str.toCharArray();
        for (char eachChar : arrStr) {
            if(!str2.contains(String.valueOf(eachChar))){
                str2 += eachChar;
            }
        }
       return str2;
    }

}
