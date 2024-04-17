package day09_a_scanner;

import java.util.Scanner;

public class RateCalculator {

    public static void main(String[] args) {

        double salary, hoursInAWeek, hourlyRate;

        Scanner input = new Scanner(System.in);
        System.out.println("What is your annual salary: ");
        salary = input.nextDouble();
        System.out.println("How many hours do you work per week: ");
        hoursInAWeek = input.nextDouble();

        hourlyRate = salary/(hoursInAWeek * 52);

        System.out.println("With the annual salary of " + salary + " and working for " + hoursInAWeek + " hours in a week, your hourly rate is $" + hourlyRate);
























    }
}
