package day09_a_scanner;

import java.util.Scanner;
public class WorkStatus {

    public static void main(String[] args) {

        String name, lastName;
        boolean employed, student;
        //declare an instance of Scanner class
        Scanner userInput = new Scanner(System.in);


        System.out.print("Enter your First name: ");
        name = userInput.nextLine();
        System.out.print("Enter your Last name: ");
        lastName = userInput.nextLine();
        System.out.print("Are you employed? [true/false]");
        employed = userInput.nextBoolean();

        System.out.print("Are you a student? [true/false]");
        student = userInput.nextBoolean();


        String personInfo = name + " " + lastName + " is employed: " + employed + " and the person is a student: " + student;


        System.out.println(personInfo);



    }
}
