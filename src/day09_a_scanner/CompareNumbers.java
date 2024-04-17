package day09_a_scanner;
import java.util.Scanner;
public class CompareNumbers {

    public static void main(String[] args)
    {

        int num1, num2;

        char char1, char2;

        //declare and instance/object of Scanner class
        //we declare the scanner reference and assign an object to it
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        num1 = userInput.nextInt();
        System.out.println("Enter number 2: ");
        num2 = userInput.nextInt();

        System.out.println("Your 1st number is " + num1 + "\nYour 2nd number is " + num2);

        boolean compareTwoNums = num1 == num2;

        System.out.println("The nums are equal: " + compareTwoNums);

        System.out.println("Enter 1st character: ");
        char1 = userInput.next().charAt(0);

        System.out.println("Enter 2nd character: ");
        char2 = userInput.next().charAt(0);

        boolean charEqual = char1 == char2;

        System.out.println("The characters are equal: " + charEqual);




    }

}
