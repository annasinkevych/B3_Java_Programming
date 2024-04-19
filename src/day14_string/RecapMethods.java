package day14_string;

import com.sun.security.jgss.GSSUtil;

public class RecapMethods {

    public static void main(String[] args) {

        String s = "pen"; //string literal declaration or by literals

        String s2 = new String("pen"); //s2 is a String object declared by 'new' keyword, stored in HEAP


        //TODO: check the execution flow (prints false only without parentheses
        System.out.println("Compare with == \t\t" + (s ==s2)); //returns false because different memory location

        System.out.println("Compare with .equals(): " + s.equals(s2)); //returns true since the values of 2 strings are the same

        System.out.println("Compare with .equals():" + s.equals("Pen"));//false because different case

        System.out.println("Compare with .equals(): " + s.equalsIgnoreCase("Pen"));//ignore case compared the values ignoring the first uppercase letter


        boolean isSame = s.equalsIgnoreCase("Pen"); //returns boolean


        if(!isSame)
        {
            System.out.println("By ignoring the case sensitiveness the result is true");
        }else
        {
            System.out.println("Even ignoring case sensitiveness, the result is false");
        }


        int stringLength = s.length(); //returns int

        System.out.println("The length of the string is: " + stringLength );

        int a = 9;
        int num = (a+"").length();
        (a + " ").length();
        System.out.println((a + "").length());

        if(num%2==0)
        {
            System.out.println("Length of num: ");
        }
        else
        {
            System.out.println("Length of num is odd number");
        }

        String word = "loopcamp";

        if(word.length()% 2 == 0)
        {
            System.out.println("length of num is even number");
        }
    }
}
