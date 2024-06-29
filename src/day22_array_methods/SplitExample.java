package day22_array_methods;

import java.util.Arrays;

public class SplitExample {

    public static void main(String[] args) {

        //.split() --> splits array by either a comma or a space or any other separator that we can specify to look for in the string
        // and put each separate word into its owm index of the string array
        String str = "monday, tuesday, wednesday, thursday, friday, saturday, sunday";
        String [] newArray = str.split(",");

        System.out.println(Arrays.toString(newArray));

        System.out.println();
        String str5 = "It is a break time";
        String [] arr = str5.split("-"); //----> [It is a break time]




    }
}
