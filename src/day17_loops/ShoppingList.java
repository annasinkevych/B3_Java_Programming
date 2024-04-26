package day17_loops;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        String list = "Shopping list: ";
        String answer = " ";

        do{
            System.out.println("Enter the item name");
            String userItem = key.nextLine().trim();
            list = list + "\n\t" + userItem;

            System.out.println("Would you like to add another item? ");
            //answer = key.next(). charAt(0); //if I wast to user a char
            answer = key.nextLine();
        }while(answer.equalsIgnoreCase("yes") || answer.startsWith("y") );


        System.out.println(list);
    }
}
