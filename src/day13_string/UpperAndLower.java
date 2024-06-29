package day13_string;

import org.w3c.dom.ls.LSOutput;

public class UpperAndLower {

    public static void main(String[] args) {
        String str = "sNOw";

        System.out.println(str.toUpperCase());
        str = str.toUpperCase(); //reassigning the new to upper case value(we've created a new one because strings are immutable
        System.out.println(str);

        System.out.println(str.toLowerCase());
        str = str.toLowerCase();
        System.out.println(str);

        String word1 = "Loop";
        String word2 = word1 + "camp";
        System.out.println(word1.toUpperCase() + word2.toLowerCase());
        System.out.println(word1 + word2);


    }
}
