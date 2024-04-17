package day03_comments_escape_sequence;

public class Quotes {
    public static void main(String[] args)
    {
        System.out.println("Test");
        System.out.println("Test");
        System.out.println("Test");
        System.out.println("Test");
        System.out.println("Test");
        System.out.println("Test");
        System.out.println("Test");
        System.out.println("Test");
        System.out.println("Test");
        System.out.println("Test");
//        System.out.println("Test");
//        System.out.println("Test");
//        System.out.println("Test");

        /*
            Q: How can you output or run or execute this:

            I like "java" programming. Escape sequence is \ backward slash
         */
    //prints "java"
    System.out.println("I like \"java\" programming");

    //print The car has on\off button
    System.out.println("The car has on\\off button");
 /*
            Q: How can you output or run or execute this:

            print The car has on\\off button
         */
        System.out.println("The car has on\\\\off button");

        int quantity;

        quantity = 3;


        char test = 'I';

        System.out.println(test); //prints 73 the assined number to character I
        System.out.println(test+2); //prints 75 the assined number of a character that is 2 numbers away from I -- K
        System.out.println((char)(test+2)); //prints characater K


    }
}
