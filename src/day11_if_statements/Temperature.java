package day11_if_statements;

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter the temperature: ");
        int temp = input.nextInt();

        if(temp >= 70)
            System.out.println("It's a nice day.\nGo outside, but with your laptop to code java");
        else
            System.out.println("It's too cold.\nCode more java");

    }
}
