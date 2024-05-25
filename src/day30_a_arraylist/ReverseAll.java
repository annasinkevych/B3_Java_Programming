package day30_a_arraylist;

import my_utilities.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseAll {

    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>(Arrays.asList("ted", "talk", "learn"));

        System.out.println(reverseEachWord(list));

    }

    /**
     * This method modifies the original ArrayList by adding a reversed version of that element
     * @param list  - ArrayList Of Strings
     * @return Modified version of the original list
     */
    public static ArrayList <String> reverseEachWord(ArrayList <String> list)
    {
        ArrayList <String> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list.set(i,StringUtil.reverse(list.get(i)));
        }

        return list;
    }
}
