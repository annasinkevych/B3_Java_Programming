package day27_wrapper_arraylist;

import java.util.ArrayList;

public class RemoveExample {

    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList <>();
        System.out.println(list);

        list.add("water");
        list.add("bread");
        list.add("juice");
        list.add("fruit");
        System.out.println(list); //[water, bread, juice, fruit]

        list.add(1,"rice");
        System.out.println(list); //[water, rice, bread, juice, fruit]

        System.out.println(list.remove(0)); //also returns the element that was removed -->water
        String elementRemoved = list.remove(0);//also returns the element that was removed -->rice
        System.out.println(elementRemoved); //[bread, juice, fruit]
        System.out.println(list);

        //remove the last one
        System.out.println(list.remove(list.size() - 1) + " was removed.");//fruit
        System.out.println(list); //[bread, juice]
        list.remove("juice");
        System.out.println(list);//[bread]

        System.out.println(list.remove("milk"));//returns a boolean false because the element didnt exist


        list.add("banana");
        list.add("banana");
        System.out.println(list);
        System.out.println(list.remove("banana")); //returns true because the element did exist in the array lsit before removing it, but it removed the first match found

    }
}
