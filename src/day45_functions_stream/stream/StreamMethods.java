package day45_functions_stream.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {

    public static void main(String[] args) {
        //How do we create a stream - since it is not a class or data structure --> we call the .stream .method
        //Stream is a method which works with Data Structure, It has other useful methods which we could chain together


        //We will use it for Array and ArrayList but can also be used with any collection

        //#1 - stream with Array
        int [] arr = {1,2,3,4,5};

        //In order to create a stream for Array, array itself does not have a method that we can use
        //so we use one from Arrays class
        Arrays.stream(arr); //here we just had access to use stream() with array or we converted our array into stream

        //#2 - stream with ArrayList
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,7,8,9));
        list.stream(); //converts ArrayList to stream

        //STREAM METHODS
        //#1 - distict();
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,32,4,1,6,7,6,7,8,9));
        System.out.println("Distinct Method: " + list2.stream().distinct());//just like this it will do some action and show me the memory location
        //After we converted ArrayList into Stream and did some action we need to convert it back to List, Set, Map
        //To Do that, there is a method called .collect() for List
        System.out.println("Distinct Method: " + list2.stream().distinct().collect(Collectors.toList()));//Distinct Method: [1, 2, 32, 4, 6, 7, 8, 9] - This still did not change the data structure

        System.out.println("Before stream: " + list2);
        list2 = list2.stream().distinct().collect(Collectors.toList());
        System.out.println("After stream: " + list2);


        //#1.2 - distict(); - with array
        //We will convert array into stream, then do some action, then convert back to array
        //We've removed all the duplicates and converted in back to an array

        //We don't want taking space in our Heap memory so we dou not user Stream refVar
        int [] arr2 = {1,2,3,4,5, 45, 67, 45, 77, 87, 77};
        System.out.println("Before stream: " + Arrays.toString(arr2));
        arr2 = Arrays.stream(arr2).distinct().toArray();
        System.out.println("After stream: " + Arrays.toString(arr2));


        //#4 - skip()

        List <Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4, 5, 6,7,8,9, 10));
        System.out.println(list3.stream().skip(4).collect(Collectors.toList())); //this skips 4 first elements and keeps all from 5 onwards
        list3 = list3.stream().skip(4).collect(Collectors.toList());
        System.out.println(list3); //[5, 6, 7, 8, 9, 10]
        String [] arr3 = {"a","b","c","d","e","f"};
        System.out.println( Arrays.toString(Arrays.stream(arr3).skip(3).toArray()) );

        System.out.println();
        //--------------------------------------------------------------
        // #5 - limit() - opposite of skip()
        ArrayList <Integer> list4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(  list4.stream().limit(6).collect(Collectors.toList())  );
        System.out.println(list4.stream().limit(7).skip(3).collect(Collectors.toList()));

        System.out.println("================");
        //#6 -count()
        List <Integer> list5 = new ArrayList<>(Arrays.asList(1,1, 1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        //get me how many different numbers we have in list
        System.out.println(list5.size());
        System.out.println(list5.stream().count());
        System.out.println(list5.stream().distinct().count());


        //Task: how many different character I have in String ?
        String str = "aaaabbbbccccdddeeeffffggg";
        System.out.println(Arrays.stream(str.split("")).distinct().count()); // total number of different character
        System.out.println(Arrays.toString(Arrays.stream(str.split("")).distinct().toArray()));
        System.out.println(Arrays.stream(str.split("")).distinct().collect(Collectors.toList()));

        /*
            you can use stream with ANT TYPE of COLLECTION (List, Set) - Map
            ArrayList is the one mostly used, that is why we practice with that.
         */

    }

}
