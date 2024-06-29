package day24_custom_methods;

import java.util.Arrays;
import java.util.Scanner;

public class Book {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("How many chapters are in book: ");

        String [] [] book = new String [key.nextInt()][];  //if you enter a negative value you will get an error .NegativeArraySizeException --> and we'll need to handle that exception . if we enter another character InputMismatchException -- > also need to handle that later
//
//        book[0] = new String [] {"h", "a"};
//        book[1] = new String [] {"k", "l"};


        System.out.println(Arrays.deepToString(book));
        //System.out.println(book[2][0]); //NullPointer Exception when no data in the inner single dimensional arrays, only throws this exception when you try to access the array and its element that is withing the size of the 2D array

        key.nextLine();
        for (int i = 0; i < book.length; i++) {
            System.out.println("Enter paragraph for each chapter: ");
            String eachParagraph = key.nextLine();
            //[[Hello people, Welcome people!], [Bye people, See you later people!]]
            book[i]  = eachParagraph.split("! ");

        }
        System.out.println(Arrays.deepToString(book));



    }
}
