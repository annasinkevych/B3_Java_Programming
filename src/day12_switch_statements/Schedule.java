package day12_switch_statements;

import java.util.Scanner;

public class Schedule {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a day of the week to see your schedule: ");
        String day = input. next();
        String information = "";

        switch(day)
        {
            case "Monday": case "Mon":
            case "monday":
                    information = "We have mentor session.";
                    break;
            case "Tuesday": case "Friday":
            case "Tue": case "Fri":
            case "tuesday": case "friday":
                    information = "We do not have class.";
                    break;
            case "Wednesday":case "Thursday":
            case "Thu": case "thursday":
            case "Wed": case "wednesday":
                    information = "We have Java Class at 7 pm";
                    break;
            case "Saturday": case "Sat":
            case "saturday":
                    information = "We have JAVA class starting at 9:30 am";
                    break;

            case "Sunday": case "Sun":
            case "sunday":
                    information = "We have Soft Skills Class starting at 9:30 am";
                    break;
        }

        System.out.println(information);

    }
}
