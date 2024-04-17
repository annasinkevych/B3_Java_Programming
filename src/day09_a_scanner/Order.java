package day09_a_scanner;

import java.util.Scanner;

public class Order {

    public static void main(String[] args) {


//        Scanner input = new Scanner(System.in);
//        String letter = input.next();
//
//        char letter2 = 'A';
//
//        System.out.println();


        //Object referenceName = object(parameter)

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a product name: ");
        String productName = input.nextLine();

        System.out.println("Enter the price of " + productName + " $" );
        double price = input.nextDouble();

        System.out.println("How many " + productName + " do you want to buy?");
        int quantity = input.nextInt();

        input.nextLine();
        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        double total = quantity * price;
        //fullName

        String orderDetail = fullName + ", your order for " + quantity + " " + productName + " has been placed.\nYour total is: $" + total;

        System.out.println(orderDetail);


    }
}
