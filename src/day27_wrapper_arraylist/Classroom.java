package day27_wrapper_arraylist;

import java.util.ArrayList;

public class Classroom {

    public static void main(String[] args) {
        ArrayList <String> groupTwo = new ArrayList<>();
        System.out.println(groupTwo.size()); //0
        groupTwo.add("Laura");
        groupTwo.add("Jeyhun");
        groupTwo.add("Andrew");
        groupTwo.add("Alex");
        groupTwo.add("Ayaz");

        ArrayList <String> groupThree = new ArrayList<> ();
        groupThree.add("Anna");
        groupThree.add("Gedi");
        groupThree.add("Kanan");
        groupThree.add("Sammy");
        groupThree.add("Ludmilla");

        System.out.println(groupTwo.get(0)); //returns an element which is a String type object in this case its Laura

        System.out.println(groupThree.get(0)); //returns an element which is a String type object in this case its Anna

        System.out.println(groupTwo.get(groupTwo.size()-1));

        System.out.println("Group 2");
        for(int i = 0; i < groupTwo.size(); i++)
        {
            System.out.println("Student " + (i+1) + ": " + groupTwo.get(i));
        }

        int counter = 1;

        System.out.println("Group 3");
        for(String each: groupThree)
        {
            System.out.println("Student "+ counter++ + ": " + each);
        }
    }
}
