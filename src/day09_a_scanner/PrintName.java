package day09_a_scanner;
import java.util.Scanner; //import the Scanner class

public class PrintName {

    public static void main(String[] args) {

        String name;

        int age;

        //Scanner object declaration or instantiate a Scanner objkect
        Scanner userInput = new Scanner(System.in); //System.in take it from user input and assign it to here

        System.out.println("Enter your name:\n");
        name = userInput.nextLine(); //read user input
        System.out.println("Enter your age:\n");
        age = userInput.nextInt();



        System.out.println("Your name is: " + name);
        System.out.println("Your age is :" + age);




    }

}
