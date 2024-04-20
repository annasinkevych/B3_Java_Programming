package day15_string;

import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Enter a sentence: ");

        String sentence = key.nextLine();

        System.out.println(0 + sentence.charAt(0));//returns an ASKII code number associated with the character at index 0(first character)--> returned char when used in arithmetic operation uses ASKII code number to complete this expression
        System.out.println(0 + sentence.charAt(sentence.length() - 1));//returns an ASKII code number associated with the character at the last index of this string

        System.out.println("First char: " + sentence.charAt(0));
        System.out.println("Last char: " + sentence.charAt(sentence.length()-1));//throws error because the index is out of scope for this string
    }
}

