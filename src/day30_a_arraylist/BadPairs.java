package day30_a_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BadPairs {

    public static ArrayList <Integer> goodPairs (ArrayList <Integer> list)
    {
        ArrayList<Integer> goodList = new ArrayList<>();

        for (int i = 0; i < list.size(); i+=2 ) {
            if (list.get(i) <= list.get(i+1)){
                goodList.add(list.get(i));
                goodList.add(list.get(i+1));
            }
        }
        return goodList;
    }

    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>(Arrays.asList(3,5, 2, 64, 23, 1234, 76, 23,45,2, 3,3));

        System.out.println(goodPairs(nums));
    }
}
