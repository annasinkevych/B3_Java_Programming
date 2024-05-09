package day22_array_methods;

import java.util.Arrays;

public class SortStringExample {

    public static void main(String[] args) {

        //only compares the first characters to sort them in the ascending order based on the ASCII table
        String [] arr = {" java", "Hello", "$Dollar", "Zelle", "soft skills", "4four", "6Six", "Hi", "SIX"};


        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


    }
}
