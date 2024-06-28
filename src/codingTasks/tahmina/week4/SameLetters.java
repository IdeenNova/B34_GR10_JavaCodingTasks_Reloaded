package codingTasks.tahmina.week4;
 /*Write a return method that check if a string is build out of the same letters as another string.
    Ex:  same("abc",  "cab"); -> true
    same("abc",  "abb"); -> false:*/

public class SameLetters {

    public static void main(String[] args) {
        System.out.println(sameLetterMethod("abcd", "dcab"));
    }
   
public static boolean sameLetterMethod(String str1, String str2){
    char[] arrstr1 = str1.toCharArray();
    for (char eachChar : arrstr1) {
        if (!str2.contains(String.valueOf(eachChar)) && str1.length()!= str2.length()){
            return false;
        }
    }
    return true;
   
        
    }
}
    



