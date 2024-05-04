package day21_arrays;

import java.util.Arrays; //utility package to use array methods

public class ArrayIntro {

    public static void main(String[] args) {

        String str = "Chicago, NewYork, Houston, Denver, Pittsburgh";

        //declared 5 different strings = 5 different containers
        String city1 = "Chicago",
               city2 = "NewYork",
               city3 = "Houston",
               city4 = "Denver",
               city5 = "Pittsburgh";



        //declare a one-dimensional Array
        String [] cities = {"Chicago", "NewYork", "Houston", "Denver", "Pittsburgh"}; //or declare it like this --> String cities [];

        //or add variables into it
        String [] cities2 = {city1, city2, city3, city4, city5};


        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        System.out.println(cities[4]);

        //printing all values in the array without the for loop
        System.out.println("All cities: " + cities[0] + ", " + cities[1] + ", " + cities[2] + ", " + cities[3] + "," + cities[4]);

        //print character at position 0 of the first element if the array(also position zero)
        System.out.println(cities[0].charAt(0));

        //This doesn't print the elements of the array --> it gives some hashcode --> kind of memory location --> [Ljava.lang.String;@6d311334
        System.out.println(cities);


        //prints our array using a toString method from the Array class utility package
        //it prints it with [] --> [Chicago, NewYork, Houston, Denver, Pittsburgh]
        System.out.println(Arrays.toString(cities));

        //so now we can assign it to a string because toString methods converts it to a string
        // the below assigns [Chicago NewYork Houston Denver Pittsburgh] to a String convertedArr
        String convertedArr = Arrays.toString(cities).replaceAll(",", ""); //we replace each comma with nothing
        System.out.println(convertedArr); // prints without commas --> [Chicago NewYork Houston Denver Pittsburgh]
        //not that cities is converted to a String we cannot use indexed to print each element, we would use a substring to do so
        //now prints without [] --> Chicago NewYork Houston Denver Pittsburgh
        System.out.println(convertedArr.substring(1,convertedArr.length() -1));

        //How to tell the array list length
//        System.out.println(cities.length); // --> we have 5 elements in our cities array



        //or use foreach loop, pick a data type to assign each value of the array to, in this case we have a String array so we pick a String element to store each value
//        for (String element : cities)
//            System.out.print(element + ", ");
//



    }
}
