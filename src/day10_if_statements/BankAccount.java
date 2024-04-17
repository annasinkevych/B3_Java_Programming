package day10_if_statements;

import java.util.*;

public class BankAccount {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("What is uour balance: $");
        double balance = input.nextDouble();
        System.out.print("How much you want to withdraw? $");
        //double amount = 500; //hardcoded
        double withdraw = input.nextDouble(); //dynamic way

        balance -= withdraw;

        if(balance < 0)
        {
            System.out.println("You took too much balance. $100 overdraft fee will be applied.");
            balance -=100;
            System.out.println("Your balance after fee is: $" + balance);
        }
        else
        {
            System.out.println("Your balance after withdrawal is: $" + balance);
        }



//        System.out.println("Your new balance is: $" + balance);










    }
}
