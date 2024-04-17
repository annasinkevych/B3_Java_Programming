package day12_switch_statements;

import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.Scanner;

public class LoginApp {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int actualPin = 1552;
        int actualSSN = 2314;

        System.out.println("Please enter your pincode");
        int userInputPin = input.nextInt();

        System.out.println("Enter the last 4 digits of your SSN: ");
        int userInputSSN = input.nextInt();

        if(actualPin == userInputPin && actualSSN == userInputSSN)
        {
            System.out.println("Authentication successful!");
        }
        else
        {
            System.out.println("Authentication failed. Try again.");
            if(actualPin != userInputPin)
            {
                System.out.println("Incorrect Pincode");
            }

            if(actualSSN != userInputSSN)
            {
                System.out.println("Incorrect SSN");
            }

        }


    }
}
