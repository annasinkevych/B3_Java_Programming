package day16_loops;

import java.util.Scanner;

public class ReplaceMethod {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        String s = "Java is a language".replace('a','e');;//.replace changes all the chars specified to the ones that you define

        System.out.println(s);

        String day = "Today is Wednesday. We will do practice. It is Wednesday.".replace("Wednesday", "Today");;

    }
}
