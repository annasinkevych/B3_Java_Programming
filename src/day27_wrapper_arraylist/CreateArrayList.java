package day27_wrapper_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateArrayList {

    public static void main(String[] args) {
        ArrayList <String> listOne = new ArrayList<>();

        listOne.add("Hello");
        listOne.add("Bye");
        System.out.println(listOne);

        ArrayList <String> listTwo = new ArrayList<>(listOne); //We added elements from ListOne into ListTwo

        System.out.println(listTwo);
        listTwo.add("Hola");

        System.out.println();
        System.out.println(listOne);//[Hello, Bye]
        System.out.println(listTwo);//[Hello, Bye, Hola]


        ArrayList <String> listThree = new ArrayList<>(Arrays.asList("One", "Two", "Three"));
        System.out.println(listThree);//[One, Two, Three]

        //ArrayList <String> listFour = new ArrayList<>("One", "Two", "Three");  // THIS IS NOT VALID



    }
}
