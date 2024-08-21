package codingTasks.viktoriia.week5;

public class reverse {
   /*!!! Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA*/

        public static void main(String[] args) {
            String str = "ABCD";
            System.out.println(reverse(str));
        }

        public static String reverse(String str) {
            String reversed = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                reversed += str.charAt(i);
            }

            return reversed;
        }

}
