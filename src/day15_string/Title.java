package day15_string;

import java.util.*;
public class Title {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Please enter your name with titles: ");
        String name = key.nextLine().toLowerCase();

        if(name.startsWith("mr.") || name.startsWith("mister."))
        {
            System.out.println("Hello Sir");
        }
        else if(name.startsWith("ms.") || name.startsWith("miss.") || name.startsWith("madam "))
        {
            System.out.println("Hello Ma'am");
        }
        else if(name.startsWith("dr."))
        {
            System.out.println("Hello Doctor");
        }else if(name.endsWith("sr."))
        {
            System.out.println("Nice to meet you Senior");
        }else if(name.endsWith("jr."))
        {
            System.out.println("Nice to meet you Junior");
        }

        //another method substring to extract pieces of string to make it right

    }
}
