package day22_array_methods;

import java.util.Arrays;

public class ReverseMiddleWord {

    public static void main(String[] args) {

        String str = "java always fun";
        String [] words = str.split(" "); //--> [java always fun]

      char [] letters =  words[1].toCharArray(); // --> ['a', 'l', 'w', 'a', 'y', 's']
        String reverse = "";
        for(int i = letters.length-1; i>=0; i--)
        {
            reverse += letters[i];
        }
        System.out.println(reverse);


        words[1] = reverse;

        System.out.println(Arrays.toString(words));
    }

}
