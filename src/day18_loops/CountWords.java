package day18_loops;

import java.util.Scanner;

public class CountWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String sentence = input.nextLine().trim();
        int count = 1;
        //enter a string
        //count spaces between words

        for(int i = 0; i < sentence.length(); i++)
        {
            if(sentence.charAt(i) == ' ')
                count++;
        }

        System.out.println("You have " + count + " words in your sentence.");

    }
}
