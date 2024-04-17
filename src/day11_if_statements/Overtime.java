package day11_if_statements;

import java.util.Scanner;

public class Overtime {

    public static void main(String[] args) {
        double hourlyRate = 40,
               numOfHours,
               netPay,
               overtimeRate;

        Scanner key = new Scanner(System.in);

        System.out.println("Enter your hourlu rate: $");
        hourlyRate = key.nextDouble();
        System.out.println("Enter your total hours: ");
        numOfHours = key.nextDouble();

        overtimeRate = hourlyRate * 1.5;

        String message = "";

        //boolean = isOvertime = numOfHours > 40;

        if(numOfHours > 40) // --> 43 hours --> 40 * regularRate + 3 * overtimeRate
        {
            netPay = (40 * hourlyRate) + ((numOfHours - 40) * overtimeRate);
            message = "You worked " + numOfHours + " hours at rate of " + hourlyRate + ". Since you have overtime, your total pay is $" + netPay;

        }
        else
        {
            netPay = numOfHours * hourlyRate;
            message = "You worked " + numOfHours + " hours at a rate of " + hourlyRate + ". There was NO OVERTIME. Your total pay is $" + netPay;
        }

        System.out.println(message);



    }
}
