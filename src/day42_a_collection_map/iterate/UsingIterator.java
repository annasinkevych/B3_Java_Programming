package day42_a_collection_map.iterate;

import java.util.*;

public class UsingIterator {

    public static void main(String[] args) {
        ArrayList <String> names  = new ArrayList<> ();
        names.add("John");
        names.add("Jane");
        names.add("Mickey");
        names.add("Jack");
        names.add("Mouse");

        //to be able to use Iterator, I need to first declarer Iterator
        Iterator <String> iterator = names.iterator();
        System.out.println(iterator.next());//more the cursor/pin and return the element
        System.out.println(iterator.next());//John
        System.out.println(iterator.next());//Jane
        System.out.println(iterator.next());//Mickey
        System.out.println(iterator.next());//Jack
        System.out.println(iterator.next());//Mouse




    }
}
