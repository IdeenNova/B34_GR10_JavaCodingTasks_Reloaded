package codingTasks.tahmina.week5;

public class findUnique {
    /*String -- Find the unique
    Write a return method that can find the unique characters from the String
    Ex: unique("AAABBBCCCDEF") ==> "DEF";*/

    public static void main(String[] args) {
        System.out.println(finUnique("AAABBBCCCDEF"));
        System.out.println(finUnique2("AAABBBCCCDEF"));
        System.out.println(trimDuplicated("AAABBBCCCDEF"));//off-topic practice
    }


    public static String finUnique(String str){
        String unique = "";
        char[] charArray = str.toCharArray();
        for (char each : charArray) {
            if (str.indexOf(each) == str.lastIndexOf(each)) {
                unique += each;
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


/////// off-topic practice
    public static String trimDuplicated(String str){
        String trimmedStr = "";

        for (int i = 0; i < str.length(); i++) {
            String character = ""+str.charAt(i);
            if(trimmedStr.contains(character)){
                continue;
            }
            trimmedStr+=character;
        }
        return trimmedStr;

    }




}

