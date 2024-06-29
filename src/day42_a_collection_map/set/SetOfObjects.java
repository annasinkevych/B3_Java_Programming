package day42_a_collection_map.set;

import java.util.*;

public class SetOfObjects {

    public static void main(String[] args) {

        Set <String> set = new HashSet<>();
        set.add(null);
        set.add("hello");
        set.add("14.5");
        set.add("400");
        set.add("hello");
        set.add("%");
        System.out.println(set);
        //order of the insertion is based on


        Set <String> set2 = new LinkedHashSet<>();  // reference of the interface Set, but the object is LinkedHashSet
        set2.add(null); // null is accepted
        set2.add("hello");
        set2.add("$14.5");
        set2.add("400");
        set2.add("hello"); // Set does NOT allow duplicate
        set2.add("%");
        set2.add("400");
        System.out.println(set2); // Insertion order is kept.

        System.out.println();


        Set <String> set3 = new TreeSet <>();  // reference of the interface Set, but the object is LinkedHashSet
        // set3.add(null); // null is NOT accepted
        set3.add("hello");
        set3.add("$14.5");
        set3.add("400");
        set3.add("hello"); // Set does NOT allow duplicate
        set3.add("%");
        set3.add("400");
        set3.add("ZOMBIE");
        System.out.println(set3); // Insertion order is kept.


    }
}
