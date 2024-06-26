package day42_a_collection_map.set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class ListVsSet {

    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(4);
        list.add(10);
        list.add(1);
        list.add(2);
        list.add(-5);
        list.add(10);
        list.add(4);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));


        Set <Integer> set = new HashSet<>();
        set.add(4);
        set.add(10);
        set.add(1);
        set.add(2);
        set.add(-5);
        set.add(10);
        set.add(4);
        System.out.println(set);
//        System.out.println(set.get(0));
//        System.out.println(set.get(set.size()-1));
        //Since set doesn't get indexes, we cannot access elements like in the above example
        //A: we can loop through Set and get the element by eq  equals becasue set doesn't allow duplicates
        //Q: how can we get the elements
        //A: we can loop through Set and get the element. Lets, we want to get element -5
        for (Integer each : set) {
            if (each == -5) {
                System.out.println(each);
            }
        }


        for (Integer each : set) {
            System.out.println(each);
        }


        //Q: How can I sort my HashSet
        Set<Integer> sortedSet = new TreeSet<>(set);
        System.out.println(sortedSet);


        System.out.println();
        // Q: Remove duplicates from list
        //  - sort -TreeSet
        //  - no sort - HashSet, LinkedHashSet
        System.out.println(list);
        System.out.println(new LinkedHashSet<>(list));


        //Q: you have an array of int: Remove Duplicates and sort them
        Integer [] a = {2, 4, 23, 76, 2, 345, 2, 8, 4, -3,2, -5 };
        Set <Integer> s1 = new TreeSet<>(Arrays.asList(a));
        System.out.println(new TreeSet<>(Arrays.asList(a)));

        String s = "aaabbbbbcccccdddddeeee";

        System.out.println(new HashSet<> (Arrays.asList(s.split(",")))
                .toString()
                .replace("[", "")
                .replace("]", "")
                .replace(",", "")

        );

        /*
            Above we converted String into an array
            then we converted String array into List of String
            then we converted List of String into Set of String - which removed duplicates
            then we did String manipulation to remove "[", "]" and ", " and printed it.
         */

    }
}
