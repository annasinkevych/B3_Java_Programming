package day17_loops;

import java.util.Scanner;

public class Atm {

    public static void main(String[] args) {
        int validPin = 9812;
        int userInput;
        int attempts = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to atm: ");

        do{
            System.out.println("Please enter your pin: ");
            userInput =input.nextInt();
            attempts++;
        }while(attempts <3 && userInput !=validPin);

        if(validPin == userInput)
            System.out.println("Logged in");
        else
            System.out.println("LOCKED OUT.COME AFTER A WEEK");
    }
}
