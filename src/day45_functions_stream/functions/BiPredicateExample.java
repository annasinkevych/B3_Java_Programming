package day45_functions_stream.functions;

import java.util.Arrays;
import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {

        BiPredicate<Integer [], Integer> contains = (arr, num) -> {

            for ( Integer each:arr){
                if(each == num)
                    return true;
            }

            return false;


        };

        Integer [] arr = {1,2,3,4,5};
        System.out.println(contains.test(arr, 5));


        BiPredicate<Integer [], Integer> contains1 = (arr1, num) -> {

            return Arrays.asList(arr).contains(num);
        };

        Integer [] arr1 = {1,2,3,4,5};
        System.out.println(contains.test(arr1, 56));



        //anagram - two words have the same amount and same characters in different order

        BiPredicate <String, String> isAnagram = (str1, str2) -> {
            char[] arr2 = str1.toCharArray();//converts a String into an array of chars
            char[] arr3 = str2.toCharArray();//converts a String into an array of chars
            Arrays.sort(arr2);
            Arrays.sort(arr3);
            return Arrays.equals(arr2, arr3);//compares the exact order and the number of elements and the values of the elements
        };

        System.out.println(isAnagram.test("listen", "silent"));
    }
}
