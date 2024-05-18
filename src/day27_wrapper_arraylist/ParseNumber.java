package day27_wrapper_arraylist;

import java.util.Scanner;

public class ParseNumber {

    public static void main(String[] args) {
        String year = "2024";
//        String year = "2024b "; -- > NUMBERFORMATEXCEPTION  --> has to be int only for the below code to work

        System.out.println("Current Year: " + year);
        System.out.println("Next Year " + (year+1));

        int numYear = Integer.parseInt(year);
        System.out.println("Current Year: " + numYear);
        System.out.println("Next Year " + (numYear+1));

        System.out.println("______________________");
        Scanner key = new Scanner(System.in);
        System.out.println("Enter your message on this format: I am $x years old.");
        String str = key.nextLine(); //I am 30 years old
        //In 5 years I will be $x + 5 years old

        String age = str.split(" ")[2]; //now String age holds str element at index 2( we've split the str but we haven't assigned it the variable yet, but we jave already access to its elements by index so we take element at index 2 and directly assign it into the variable age
        int year1 = Integer.parseInt(age);
        System.out.println("In 5 years I will be " +  (year1+5));

    }
}
