package codingTasks.viktoriia.week4;

public class SameLetters {
    /*Write a return method that check if a string is build out of the same letters as another string.
    Ex:  same("abc",  "cab"); -> true
    same("abc",  "abb"); -> false:*/

    public static void main(String[] args) {
        System.out.println(same("abc", "abc"));
    }

    public static boolean same(String str1, String str2) {

        if (str1.length() == 0 || str2.length() == 0)
            return false;

        if (str1.length() != str2.length())
            return false;

        boolean isSame = true; //false if any character mismatch is found

        for (int j = 0; j < str2.length(); j++) {
            if (!str2.contains(str1.charAt(j) + "") || !str1.contains(str2.charAt(j) + "")) {
                isSame = false;
            }
        }

        return isSame;
    }

}
