package codingTasks.alina.week6;


//Write a method that can return the sum of the digits in a string
public class sumOfDigits {

    public static void main (String[] arg){

        String str = "123alina456naz789";
        int sum = 0;
        String num = "";

        for (int i = 0; i < str.length();i++){

            if(Character.isDigit(str.charAt(i))){
                num+=str.charAt(i);
                                      //returns the char value into the specific index
                if(i==str.length()-1|!Character.isDigit(str.charAt(i+1))){
                    sum += Integer.parseInt(num);
                    num="";
                }

            }
        }

        System.out.println(sum);
    }
}
