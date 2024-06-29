package day45_functions_stream.functions;

import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class Recap {

    public static void main(String[] args) {

        // Create a function that can verify if a number contains duplicate digits.
        //      -- > 102341 - true
        //      -- > 123456 - false


        Predicate<Integer> verifyDuplicates = (number) -> { // 102341

            String numInString = number + ""; // "1021341"
            String uniques = "";

            for (int i = 0; i < numInString.length(); i++) {

                if (!uniques.contains(numInString.charAt(i) + "")) {
                    uniques += numInString.charAt(i); // "102
                } else {
                    return true;
                }
            }
            return false;

        };


        // Another way to do it with Collections.frequency() method
        Predicate<Integer> verifyDuplicates2 = (number) -> { // 102341

            String numInString = number + ""; // "10213418"
            boolean result = false;
            for (int i = 0; i < numInString.length(); i++) {
                result = Collections.frequency( Arrays.asList((number+"").split("")) , numInString.charAt(i)+"" ) > 1 ? true : false;             // "1021341" -- > ["1", "0", "2", "3", "4", "1"]
                if(result) {
                    break;
                }
            }
            return result;
        };


        System.out.println(verifyDuplicates.test(102341));  // true
        System.out.println(verifyDuplicates.test(123456));  // true

        System.out.println(verifyDuplicates2.test(102341));
        System.out.println(verifyDuplicates2.test(123456));

    }
}
