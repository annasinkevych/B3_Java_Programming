package day18_loops;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word you wish to check if it is palindrome or not: ");
        String str = input.nextLine().toLowerCase();


        String strReversed = "";

        for(int i = str.length()-1; i >=0; i--)
        {
            strReversed += "" + str.charAt(i);

        }
        System.out.println(strReversed);


        if(str.equals(strReversed))
            System.out.println(str + " is a Palindrome;");

        if(!str.equals(strReversed))
            System.out.println(str + " is not a Palindrome;");


        //write with a ternary if/else
        System.out.println(str.equalsIgnoreCase(strReversed)? "Palindrome": "Not Palindrome");


    }
}
