package day09_a_scanner;

import java.util.Scanner;

import java.util.concurrent.ConcurrentHashMap;

public class AddNumbers {

    public static void main(String[] args) {



        int num1, num2, num3;

        //declare an instance of a Scanner class
        Scanner key = new Scanner(System.in);


        num1 = key.nextInt();
        num2 = key.nextInt();
        num3 = key.nextInt();

        int total = num1 + num2 + num3;
        //System.out.println("The sum of the numbers: " + (key.nextInt() + key.nextInt() + key.nextInt()));

        System.out.println("The sum of the numbers: " + total);

        //divide by 2
        double division = (double)total/2;

        System.out.println("After division: " + division);



    }
}
