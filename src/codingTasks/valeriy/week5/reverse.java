package codingTasks.valeriy.week5;

public class reverse {
   /* Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA*/


    public static void main(String[] args) {



        System.out.println(reverseString("Java"));
        System.out.println(reverseStringV2("Java"));

    }

    public static String reverseString(String string){
        char[] arrString = string.toCharArray();
        char[] arrReverse = new char[arrString.length];

        for (int j=0,i = arrString.length - 1; i >= 0; i--,j++) {
            arrReverse[j]=arrString[i];
        }

        String reverseString = new String(arrReverse);
        return reverseString;
    }


       public static String reverseStringV2(String string) {
        String reversedString = "";
           for (int i = string.length() -1; i >= 0; i--) {
               reversedString+=string.charAt(i);
           }
        return reversedString;

    }


}
