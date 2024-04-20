package day15_string;

public class IndexOfMethod {


    public static void main(String[] args) {


        //.indexOf("") --> checks left ro right and ones it finds the value provided it returns its index
        String s = "penpen";
        System.out.println(s.indexOf("p"));
        System.out.println(s.indexOf("e"));
        System.out.println(s.indexOf("n"));


        System.out.println(s.indexOf('p'));;//can only pass a single char with
        System.out.println("____________________");
        System.out.println(s.indexOf("pe")); //returns index of first character after it checked if all thtwo characters are found in the string in the exact same order

        System.out.println(s.indexOf("x")); // returns -1 --> meaning there is no such character


        System.out.println(s.indexOf("p", 1)); // --> start searching for letter p but start at index 1
    }
}
