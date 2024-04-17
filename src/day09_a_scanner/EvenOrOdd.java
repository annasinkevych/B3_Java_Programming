package day09_a_scanner;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();

        boolean isOdd = num %2 != 0,
                isEven = num % 2  ==0;

        System.out.println("The number is Odd: " + isOdd);
        System.out.println("The number is Even: " + isEven);


    }




}
