package day12_switch_statements;


import java.util.*;

public class VendingMachine {


    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        int drinkType;
        System.out.println("Welcome to the Vending Machine");
        System.out.println("Please, select 1 of the following: \n\tDrinks\n\tSnacks\n\tGums");
        String item = key.next();

        switch (item) {
            case "Drinks":
                System.out.println("You have selected Drinks.");
                System.out.println("Choose your drink by pressing number: \n\t1 - Water\n\t2 - Soda\n\t3 - Juice");
                drinkType = key.nextInt();
                switch (drinkType) {
                    case 1:
                        System.out.println("You've selected water.");
                        break;
                    case 2:
                        System.out.println("You've selected soda");
                        break;
                    case 3:
                        System.out.println("You've selected juice");
                        break;
                    default:
                        System.out.println("invalid number");
                }

                break;
            case "Snacks":
                System.out.println("\nYu have selected Snacks.\nChoose your snack by pressing number: \n\t1 - Candies\n\t2 - Chips]\n\t3 - Cookies");
                System.out.println("\n\tSelect:");
                int snackOptionNum = key.nextInt();

                if (snackOptionNum == 1) {
                    item = "Cookies";
                } else if (snackOptionNum == 2) {
                    item = "Candies";
                } else if (snackOptionNum == 3) {
                    item = "Cookies";
                } else
                    System.out.println("Invalid number");
                break;
            default:
                System.out.println("Invalid selection");


        }



    }
}
