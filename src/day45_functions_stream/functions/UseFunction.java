package day45_functions_stream.functions;

import java.util.*;
import java.util.function.Function;

public class UseFunction {
    public static void main(String[] args) {

        //<T, R> --> accepts one Object Type (T) and returns one Object Type (R)
        Function<int [], List<Integer>> convertArrayIntoList = arr ->{
            List<Integer> list = new ArrayList<>();
            for(int each: arr)
            {
                list.add(each);
            }

            return list;
        };

        int [] a = {34, 23, 62, 123, 64, 2};
        System.out.println(convertArrayIntoList.apply(a));


        //also remove duplicates
        //When you pass a List to a HashSet, it will remove any duplicate elements from the list since a HashSet only allows unique elements.
        System.out.println(new HashSet<>(convertArrayIntoList.apply(a)));

        //also sort
        //The TreeSet constructor can take a collection as an argument. When a List is passed to this constructor, the TreeSet will be initialized with the elements of the List, automatically removing duplicates and sorting the elements according to their natural ordering or a provided comparator.
        System.out.println(new TreeSet<>(convertArrayIntoList.apply(a)));
    }
}
