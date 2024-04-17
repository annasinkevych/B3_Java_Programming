package day12_switch_statements;

import java.util.*;

public class ChooseLanguage {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.println("Please enter a language by the number: \n\t1 - English\n\t2 - Spanish\n\t3 - Turkish\n\t4 - Ukrainian\n\t5 - French\n\t6 - Azerbaijani\n\n\tChoose an option: ");

        int userInput = key.nextInt();

        if(userInput == 1)
        {
            System.out.println("Hello, thanks for your call!");
        }
        else if(userInput == 2)
        {
            System.out.println("Hola, gracias para llamar!");
        }
        else if(userInput == 3)
        {
            System.out.println("Merchaba, araduginiz icin tesekkurler!");
        }
        else if (userInput == 4)
        {
            System.out.println("Pryvit, dyakuyu za vash dzvinok!");
        }
        else if(userInput == 5)
        {
            System.out.println("Merci, pour votre appel");
        }
        else if(userInput == 6)
        {
            System.out.println("Salam, zeng ettiginiz ucun mennatdariq");
        }
        else
            System.out.println("Invalid entry");

    }
}
