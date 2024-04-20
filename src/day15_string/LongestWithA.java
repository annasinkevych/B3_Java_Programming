package day15_string;

import java.util.Scanner;

public class LongestWithA {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Enter three words: ");
        String word1 = key.next().toLowerCase();
        String word2 = key.next().toLowerCase();
        String word3 = key.next().toLowerCase();

        int wordOneLength = word1.length();
        int wordTwoLength = word2.length();
        int wordThreeLength =word3.length();


        if(wordOneLength > wordTwoLength && wordOneLength > wordThreeLength && word1.contains("a"))
            System.out.println(word1 + " is the biggest");
        else if(wordTwoLength > wordOneLength && wordTwoLength > wordThreeLength && word2.contains("a") )
            System.out.println( word2 +" is the biggest");
        else if(wordThreeLength > wordOneLength && wordThreeLength > wordTwoLength && word3.contains("a"))
            System.out.println( word3 +" is the biggest");
        else
            System.out.println("There is no single biggest word");


    }

}
