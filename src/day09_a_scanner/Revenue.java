package day09_a_scanner;
import java.util.Scanner;

public class Revenue {

    public static void main(String[] args) {


        double price, revenue;
        int quantity;

        Scanner input = new Scanner(System.in);


        System.out.println("Enter the price for an item: ");
        price = input.nextDouble();
        System.out.println("Enter the quantity: ");
        quantity = input.nextInt();

        revenue = price * quantity;

        System.out.println("The revenue is: $" + revenue);



    }
}
