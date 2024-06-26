package codingTasks.valeriy.week5;

public class findUnique {
    /*String -- Find the unique
    Write a return method that can find the unique characters from the String
    Ex: unique("AAABBBCCCDEF") ==> "DEF";*/

    public static void main(String[] args) {
        System.out.println(finUnique("AAABBBCCCDEF"));
        System.out.println(finUnique2("AAABBBCCCDEF"));

    }


    public static String finUnique(String str){
        String unique = "";
        char[] charArray = str.toCharArray();
        for (char each : charArray) {
            if (str.indexOf(each) == str.lastIndexOf(each)) {
                unique += each;
            }
            for (char c : charArray) {
            }
        }
        return unique;
    }


    public static String finUnique2(String str) {
        String uniqueString = "";

        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                uniqueString += ch;
            }
        }
        return uniqueString;
    }






}

