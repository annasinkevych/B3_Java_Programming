package day21_arrays;

import java.util.Scanner;

public class SelectMonth {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String [] months = {"Jan", "Feb","Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        int num;
        do {
            System.out.println("Please enter a number so, I can return you the month name related to that number: ");

            System.out.println("Enter: ");
            num = key.nextInt();
//
//        while(num < 1 || num >12)
//        {
//            System.out.println("Wrong input, try again between 1 and 12");
//            num = key.nextInt();
//
//        }
            if(num >= 1 && num <=12)
            {
                System.out.println(months[num-1]);
            }else {
                System.out.println("Wrong Input. There is no month for that number: " + num + " Try again!");
            }

        }while(num < 1 || num >12);




    }
}
