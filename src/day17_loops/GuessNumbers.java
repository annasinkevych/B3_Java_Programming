package day17_loops;

import java.util.Scanner;

public class GuessNumbers {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        int secretNumber = 80;
        int userGuess;

        int attempt = 0;

        do
        {
            System.out.println("Guess a number from 1 t0 100: ");
            userGuess = key.nextInt();
            if(userGuess > secretNumber)
                System.out.println("Too high");
            else if(userGuess < secretNumber)
                System.out.println("Too low");
            else
                System.out.println("YOU GUESSED THE NUMBER"); //the problem with the else here it will print it before checling thw while condition

            attempt++;
        }while(userGuess != secretNumber);

        System.out.println("You guessed the correct number at attempt number: " + attempt );
    }
}
