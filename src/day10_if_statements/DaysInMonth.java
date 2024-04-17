package day10_if_statements;

import java.util.Scanner;

public class DaysInMonth {


    public static void main(String[] args) {


        int month;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of the month: ");
        month = input.nextInt();

        boolean has31Days = month == 1 || month == 3 || month == 5 | month == 8 || month == 10 || month == 12;
        boolean has30Days = month == 4 || month == 6 || month == 9 || month ==11;
        boolean has28Days = month == 2;



        if(has31Days)
        {
            System.out.println("Your month has 31 days.");
        }
        else if (has28Days)
        {
            System.out.println("Your month has 28 days.");
        }
        else if (has30Days)
        {
            System.out.println("Your month has 30 days.");
        }
        else
        {
            System.out.println("Invalid number.");
        }


    }
}
