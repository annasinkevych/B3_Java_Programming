package day12_switch_statements;

import java.util.Scanner;

public class Atm {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("*** WELCOME to ATM ***\nPlease, insert your card and type your pincode");
        int userInputPin = input.nextInt();

        int expectedPin = 6789;
        double balance = 1_000_000,
               deposit;


        //Outer if(parent)
        if(userInputPin == expectedPin)
        {
            System.out.println("You are logged in");
            System.out.println("Select a number for your operation: ");
            System.out.println("\t1 - Check Balance\n\t2 - Withrdaw\n\t3 - Deposit");
            System.out.println("Your choice: ");
            int option = input.nextInt();

            //Inner If, Nested If(Child)
            if(option == 1)
            {
                System.out.println("Your balance is: $" + balance);
            }
            else if(option == 2)
            {
                System.out.println("Enter the amount that you wish to withdraw: $");
                double withdrawAmount = input.nextDouble();
                System.out.println("Stand by... Withdrawing $" + withdrawAmount);
                balance -= withdrawAmount;

            }
            else if (option == 3)
            {
                System.out.println("Enter the amount you wish to deposit");
                deposit = input.nextDouble();
                balance += deposit;

            }
            else
            {
                System.out.println("Invalid selection. Exiting the account.");
            }

            System.out.println("If you have withdrawn or deposited or did nothing, your current balance is: " + balance);
        }
        else
        {
            System.out.println("Invalid pincode. COME BACK TOMORROW.");
        }


    }
}
