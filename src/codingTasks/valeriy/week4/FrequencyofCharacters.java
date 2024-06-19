package codingTasks.valeriy.week4;
  /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/

public class FrequencyofCharacters {


    public static void main(String[] args) {
        String str1 = "AAABBCDD";
        String str2 = frequencyOfCharactersMethod(str1);
        System.out.println("Frequency of characters: " + str2);
    }

    public static String frequencyOfCharactersMethod(String str) {
        char[] arrStr = str.toCharArray();
        int[] arrStr2 = new int[300];
        for (char each : arrStr) {
            arrStr2[each]++;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arrStr2.length; i++) {
            if (arrStr2[i] > 0) {
                result.append((char) i).append(arrStr2[i]);
            }
        }

        return result.toString();
    }
}
