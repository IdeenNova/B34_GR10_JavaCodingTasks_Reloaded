package codingTasks.nikola.week6;

public class sumOfDigits {

 //Write a method that can return the sum of the digits in a string

    public static void main(String[] args) {

        String givenString = "abc123def456ghi789";
        int sum = 0;

            // Iterate through each character in the string
        for (int i = 0; i < givenString.length(); i++) {
            char ch = givenString.charAt(i);

            // Check if the character is a digit
            if (Character.isDigit(ch)) {
                // Convert the character to integer and add to sum
                sum += Character.getNumericValue(ch);
            }
        }

        System.out.println("Sum of all digits in given string: \"" + givenString + "\" is: " + sum);
    }

    }

