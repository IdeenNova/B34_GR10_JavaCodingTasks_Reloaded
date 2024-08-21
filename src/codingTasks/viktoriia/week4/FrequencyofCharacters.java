package codingTasks.viktoriia.week4;

public class FrequencyofCharacters {
    /* !!!  Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2  */

    public static void main(String[] args) {

        String str = "AAABBCDD";
        String expected = "";

        for (int i = 0; i < str.length(); i++) {
            int num = 0;
            char currentChar = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                if (currentChar == str.charAt(j)) {
                    num++;
                }
            }

            if (expected.indexOf(currentChar) == -1) { // Only add if not already added
                expected += currentChar + "" + num;
            }
        }
        System.out.println("Expected: " + expected);

    }
    }
