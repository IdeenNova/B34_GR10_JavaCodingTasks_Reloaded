package codingTasks.viktoriia.week6;

public class sumOfDigits {

    //Write a method that can return the sum of the digits in a string


        public static void main(String[] args) {
            String str = "a1b2c3!#4j"; // = 10

            int sum = 0;

            // Iterate through each character in the string
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                // Check if the character is a digit
                if (Character.isDigit(ch)) {
                    // Convert the character to its numeric value and add it to the sum
                    sum += Character.getNumericValue(ch);
                }
            }
            System.out.println("Sum of digits in the string: " + sum);

        }


    }

