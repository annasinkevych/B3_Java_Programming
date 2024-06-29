package day13_string;
import java.util.Scanner;

public class StringMemory {
    public static void main(String[] args) {

        String first = "java"; //one way to declare a string by String literals

        String second = new String("java"); //second way to declare using new keyword

        String third = "java";
        String fourth = "javac";
//        System.out.println(first);
//        System.out.println(second);

        // == relational operator with String compares the Memory location not the values
        // Heap string pool stores duplicate values at the same location therefore compraded values return true
        //Heap by itself when new keyword is used creates a new location even though the value is the same. so compared two strings return false
        System.out.println(first == second);//false --> first is located in the string pool in the heap, second directly in the Heap
        System.out.println(second == third); //false --> second is located directly in the Heap, first in the String pool in the Heap
        System.out.println(first == third);//true -- > both have same values and are located in the String pool, so they share the same location and those two vars are pointing to the same value located in the String pool
        System.out.println(first == fourth);//false --> first in the String pool in the Heap, fourth directly in Heap


    }
}
