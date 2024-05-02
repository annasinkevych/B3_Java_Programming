package day19_nested_loops;

import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);

        //abcabcbcd
        String message = key.nextLine();
        String noDuplicates = ""; //string literals

        //loop through each character
        //add each character into another container

        for(int i = 0; i < message.length(); i++)
        {
            char eachLetter = message.charAt(i);
            if(!noDuplicates.contains("" + eachLetter))
            {
                noDuplicates += eachLetter;
            }
        }

        //or
        /*
        for(int i = 0; i < message.length(); i++)
        {
            char eachLetter = message.charAt(i);
            if(noDuplicates.contains("" + eachLetter))
            {
                continue;

            }
            noDuplicates += eachLetter;
        }
         */

        System.out.println("Old string: " + message);
        System.out.println("No duplicates: " + noDuplicates);
    }
}
