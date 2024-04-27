package day18_loops;

import java.util.Scanner;

public class CountLetter {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        String word;

        System.out.println("Enter a sentence or word to check the number of the existence of certain character: ");
        word = key.nextLine();
        System.out.println("Enter enter the character [SINGLE CHARACTER]: ");
        String character = key.next();

        while(character.length() > 1) // or character.length() != 1
        {
            System.out.println("Enter [SINGLE CHARACTER] ONLY: ");
            character = key.next();
        }
        int count = 0;

        for(int i = 0; i< word.length(); i++)
        {
            char eachCharOnEachCycle = word.charAt(i);
            if(eachCharOnEachCycle == character.charAt(0))
                count++;
        }

        System.out.println(count);
    }
}
