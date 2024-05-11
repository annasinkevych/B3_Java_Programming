package day24_custom_methods;

import java.util.Arrays;

public class LastCharacters2D {

    public static void main(String[] args) {

        String [] [] words = {
                {"James", "is", "back"},
                {"he", "was", "never", "gone"},
                {"methods", "tomorrow"}
        };

        //print out 2D array without the loop
        //System.out.println(Arrays.deepToString(words));

        //print 2D array using for each loop
//        for(String [] each: words)
//        {
////            each --> this is single array on each cycle
//            System.out.println(Arrays.toString(each));
//        }
//
//        System.out.println("----------");
//        //print 2D array using a fori loop
//        for (int i = 0; i < words.length; i++) {
////            words[i][i] //--> this is a single array on each cycle
//            System.out.println(Arrays.toString(words[i]));
//        }

        //printing last character of each word in each single dimensional array
        for(String [] eachArray: words)
        {
            for(String each: eachArray)
            {
                // You can convert each String into char Array and then get the last element as well.
                //System.out.print(eachElem.toCharArray()[eachElem.toCharArray().length -1]);
                System.out.println(each.charAt(each.length()-1));
            }
        }


        //printing last character of each word in each loop using fori loop
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length; j++) {
                System.out.print(words[i][j].charAt(words[i][j].length()-1));
                // You can convert each String into char Array and then get the last element as well.
                //System.out.print(words[i][j].toCharArray()[words[i][j].toCharArray().length-1]);

            }
            System.out.println();

        }

    }
}
