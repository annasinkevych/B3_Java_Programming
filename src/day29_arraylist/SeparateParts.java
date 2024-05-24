package day29_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class SeparateParts {

    public static void main(String[] args) {

        String str = "ABCD123$%#@456EFG!";

        ArrayList <String> list = new ArrayList<>(Arrays.asList(str.split(""))); //splits String into array of strings ny separate character by default if no regex is provided
        System.out.println(list);//[A, B, C, D, 1, 2, 3, $, %, #, @, 4, 5, 6, E, F, G, !]

        ArrayList <String> numbers = new ArrayList<>(list);
        numbers.retainAll(Arrays.asList("0", "1", "2", "3","4", "5","6","7", "8", "9"));
        System.out.println(numbers);//[1, 2, 3, 4, 5, 6]


        ArrayList <String> special = new ArrayList<>(list);
        special.retainAll(Arrays.asList("!", "@", "#", "$", "%", "^", "&", "*", "(", ")"));// [1, 2, 3, 4, 5, 6]

        ArrayList <String> letters = new ArrayList<>(list);
        letters.removeAll(numbers);
        letters.removeAll(special);
        System.out.println(letters);//[A, B, C, D, E, F, G]


    }
}
