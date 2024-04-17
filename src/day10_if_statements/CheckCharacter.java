package day10_if_statements;

import java.util.Scanner;

public class CheckCharacter {

    public static void main(String[] args) {

        char letter;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character that you want to check: ");
        letter = input.next().charAt(0);

        if(letter >= 'a' && letter <= 'z' )
        {
            System.out.println("This is a lowercase letter");
        }
        else if(letter >= 'A' && letter <= 'Z')
        {
            System.out.println("This is an uppercase letter");
        }
        else
        {
            System.out.println("It is not a letter it is one of the characters: " + letter);
        }

    }
}
