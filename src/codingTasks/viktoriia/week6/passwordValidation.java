package codingTasks.viktoriia.week6;

public class passwordValidation {

    /*String -- Password Validation Task
1. Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit

if all requirements above are met, the method returns true, otherwise returns  false
*/
    public static void main(String[] args) {

        String password = "12345User!";
        boolean length = password.length() >= 6;

        boolean lower = false;
        boolean upper = false;
        boolean number = false;
        boolean special = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (c >= 97 && c <= 122) lower = true;
            if (c >= 65 && c <= 90) upper = true;
            if (c >= 48 && c <= 57) number = true;
            if ((c >= 33 && c <= 47) || (c >= 58 && c <= 64)
                    || (c >= 91 && c <= 96) || (c >= 123 && c <= 126)) special = true;
        }

        if (!length) {
            System.out.println("Invalid length");
        } else if (!lower) {
            System.out.println("Missing lowercase letter");
        } else if (!upper) {
            System.out.println("Missing uppercase letter");
        } else if (!number) {
            System.out.println("Missing number");
        } else if (!special) {
            System.out.println("Missing special character");
        } else {
            System.out.println("Valid password");
        }
    }
}
