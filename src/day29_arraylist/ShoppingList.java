package day29_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {

    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);

        ArrayList <String> shoppingList = new ArrayList<>();
        String userAnswer = "";
        do {
            System.out.println("Enter the item: ");
            shoppingList.add(input.nextLine());

            System.out.print("Do you want to continue? y/n: ");
            userAnswer = input.nextLine();

        }while(userAnswer.toLowerCase(). charAt(0) == ('y'));


        //loop through the list

        System.out.println("The shopping list has: " + shoppingList.size() + " items: ");
        for(String each: shoppingList)
        {
            System.out.println("\t" + each);
        }
        System.out.println("Enter item you want to check if it is in the list: ");
        System.out.println(itemAvailability(shoppingList, input.nextLine()));

        System.out.println("Would you like to remove any item? ");
        String itemToRemove = "";
        if(input.nextLine().toLowerCase().charAt(0) == 'y')
        {
            System.out.println("What item do you want to remove");
            itemToRemove = input.nextLine();
            if(Character.isDigit(itemToRemove.charAt(0)))
            {
                int num = Integer.parseInt(itemToRemove);
                shoppingList.remove(num - 1);
            }
            shoppingList.remove(itemToRemove);
        }
        else
        {
            shoppingList.remove(itemToRemove);
        }
        //System.out.println(isEmpty(shoppingList));

        System.out.println("Final List: " + shoppingList);
    }

    public static String isEmpty(ArrayList <String> shoppingList)
    {
        return shoppingList.isEmpty()? "Shopping list is empty.": "You have some items.";
    }


    public static String itemAvailability(ArrayList <String> shoppingList, String element)
    {
        return shoppingList.contains(element)? element+ " is in the list": element + " is not in the list";
    }

}
