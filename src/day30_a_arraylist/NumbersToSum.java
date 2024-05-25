package day30_a_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class NumbersToSum {

    public static ArrayList<Integer> sumFromString(ArrayList <String> numsToSum)
    {
        ArrayList <Integer> sums = new ArrayList<>();

        for(String each: numsToSum)
        {
            int sumOfEach = 0;
            for(String eachLetter: each.split(""))
            {
                sumOfEach += Integer.parseInt(eachLetter);
            }
            sums.add(sumOfEach);
        }
        return sums;
    }

    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>(Arrays.asList("123", "34", "513"));
        ArrayList <Integer> summedVersion = sumFromString(list);
        System.out.println(summedVersion);
        //OR
        System.out.println(sumFromString(list));
    }
}
