package day27_wrapper_arraylist;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        //DOES NOT SUPPORT PRIMITIVE DATATYPES
        ArrayList<Integer> numbers = new ArrayList<>(); //there are no elements
        System.out.println(numbers);

        //add/assign to ArrayList
        numbers.add(40); //added 40 to the end of the ArrayList
        System.out.println(numbers);
        numbers.add(-40);
        System.out.println(numbers);
        numbers.add(60);
        numbers.add(80);
        System.out.println(numbers); //[40, -40, 60, 80]

        //to get a specific element of the ArrayList
        System.out.println(numbers.get(1)); //-40

        //How do we know the number of elements in the ArrayList
        System.out.println(numbers.size());//4

        // Reviewing the CONVERSION
        Integer a = numbers.get(0) ; // Integer --> this method always returns the type parameter in the ArrayList, this case is Integer
        int b =  numbers.get(0) ;  // Integer -- > int  --- > UNBOXING


        int c = numbers.size(); // int = int
        Integer d =  numbers.get(0) ; // int --- >  Integer ---- > AUTOBOXING


    }
}
