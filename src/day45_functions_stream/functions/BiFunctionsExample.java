package day45_functions_stream.functions;

import java.util.*;
import java.util.function.BiFunction;

public class BiFunctionsExample {

    //T t, U u ---> BiFunctions accepts two objects and returns R one object
    //abstract method ---> R apply(T t, U u)

    public static void main(String[] args) {
        BiFunction <int [], int [],List<Integer>> mergeArray = (arr, arr2)-> {


            return null;
        };


        BiFunction <Integer, Integer, Integer> maxNumber = (num1, num2) -> {

            return num1 >num2 ? num1 :num2;
        };


        System.out.println(maxNumber.apply(4, -6));


        BiFunction <List<Integer>, List<String>, Map<Integer, String>> makeMap = (list1, list2) ->{
            //Map<Integer,String> map = new HashMap<>();

            //if I want to maintain the insertion order I need to use LinkedHashMap
            //Map<Integer,String> map = new LinkedHashMap<>();

            //if I want to have it sorted in a natural order by Key not Value I would use TreeMap
            Map<Integer,String> map = new TreeMap<>();

            if(list1.size() != list2.size()){
                throw new RuntimeException("Lists do not have the same number of elements");
            }
            else
            {
                for (int i = 0; i < list2.size(); i++) {
                    map.put(list1.get(i), list2.get(i));
                }
            }

            return map;
        };

        List <Integer> listNumbers = new ArrayList<>(Arrays.asList(23,56,78,89,456,467));
        List <String> listStrings = new ArrayList<>(Arrays.asList("Apples", "Pears", "Strawberries", "Kiwis", "Bananas", "Mangoes"));
        System.out.println(makeMap.apply(listNumbers, listStrings));
    }
}
