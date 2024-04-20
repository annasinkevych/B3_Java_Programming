package day15_string;

import java.util.Scanner;

public class FixName {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = key.next().trim(); //.trim() --> removes spaces in front and in the end of the user input
        System.out.println("Enter your last name: ");
        String lastName = key.next().trim();

        String fixedFirstName = ("" + firstName.charAt(0)).toUpperCase() + firstName.substring(1).toLowerCase();
        String fixedlastName = ("" + lastName.charAt(0)).toUpperCase() + lastName.substring(1).toLowerCase(); //substrings returns everything beginning at specified index all the way to the end

        //name and last name fixed -- > no spaces, both start with upper case
        System.out.println(fixedFirstName);
        System.out.println(fixedlastName);


    }
}
