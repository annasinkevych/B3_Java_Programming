package day09_a_scanner;

import java.util.Scanner;

public class UseNext {
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.println("What is today: ");
        String day = input.nextLine();

        System.out.println("Enter your first name: ");
        String firstName = input.next();

        input.nextLine();

        System.out.println("Enter your address: ");
        String address = input.nextLine();

        System.out.println("Enter your first name: ");
        String lastname = input.next();


        //when working with different input methods of Scanner class we need to consider capturing the enter by
        //input.nextLine()
        input.nextLine();
        System.out.println("Enter your address: ");
        String address2 = input.nextLine();

        System.out.println("Today: " + day);
        System.out.println("First Name: " + firstName);
        System.out.println("Address: " + address);
        System.out.println("Address 2: " + address2);



    }
}
