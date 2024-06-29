package day30_a_arraylist;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLongString {

    public static ArrayList <String> keepLong (ArrayList <String> list, int num)
    {

        //Remove element if its length is < num
        //each is a String element from the ArrayList of Strings
        list.removeIf(each-> each.length()< num);

        ArrayList <String> updatedList = new ArrayList <>(list);



        return updatedList;
    }

    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five", "six"));
        System.out.println(keepLong(list, 4));// [three, four, five]
    }
}
