package day16_loops;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MoveFirstWord {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Please, enter a sentence: ");
        String sentence = key.nextLine().trim();

        String firstWord = sentence.substring(0,sentence.indexOf(" "));
        String secondPart = sentence.substring(sentence.indexOf(" ")).trim();
        String changedString = secondPart + " " + firstWord;
        System.out.println(changedString);


    }

}
