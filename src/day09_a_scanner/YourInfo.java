package day09_a_scanner;

import java.util.Scanner;

public class YourInfo {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: " );

        byte age = input.nextByte();

        System.out.println("Enter your favorite number: ");
        long favoriteNum = input.nextLong();

        input.nextLine();
        System.out.println("Enter your favorite book: ");
        String book = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("favoriteNum = " + favoriteNum);
        System.out.println("book = " + book);



    }
}
