package day29_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListWithMethods {

    public static void main(String[] args) {


        ArrayList <String> list = new ArrayList <>(getDaysOfWeek());

        //System.out.println(list);
        //System.out.println(getDaysOfWeek().get(0));

        System.out.println(printList(list));
        System.out.println("_____________");

        /**
         * Or DO IT THE FAST WAY IN ONE STATEMENT
         */
        System.out.println(printList(getDaysOfWeek()));
    }

    public static String printList(ArrayList <String> list)
    {
        String result = "List:";
        for(String each: list)
        {
            result += "\n\t" + each;
        }
        return result;
    }

    // TODO: METHOD OVERLOADIN ISSUE
//    public static String printList (ArrayList <Integer> list) {
//
//        // Return in specific format
//        /*
//            LIST:
//                Monday
//                Tuesday
//                ...
//         */
//        String result = "LIST:";
//        for ( Integer each : list){
//            result += "\n\t" + each;
//        }
//
//        return result;
//    }


    public static ArrayList<String> getDaysOfWeek()
    {
        ArrayList <String> weekDays = new ArrayList<>(Arrays.asList(
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        ));

        return weekDays;
    }

}
