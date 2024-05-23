package day28_arraylist;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;

public class ConvertArrayToList {

    public static void main(String[] args) {

        //array can work with any data type both primitive and non primitive
        int [] arr2 = {1,2,3};
//        Integer [] arr2 = {1,2,3}; //created an Integer array

        //Arrays.asList(arr2); //converted the array into a Collection type/ Collection data structure ARRAYLIST

//        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(arr2));//created an Arraylist by converting the Integer array into a Collection Type Integer ArrayList
        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(convertIntToIntegerArr(arr2)));

//        ArrayList <Integer> list2 = new ArrayList<>(Arrays.stream(arr2).boxed().collect(Collectors.toList()));


//        list.addAll( Arrays.asList(arr2));

//        System.out.println(list2);//[1, 2, 3]

//        list2.add(78);

        System.out.println(list);//[1, 2, 3]


    }

    public static Integer [] convertIntToIntegerArr(int[] arr)
    {
        Integer [] objArr = new Integer[arr.length];

        for (int i = 0; i <arr.length ; i++) {

            objArr[i] = arr[i];

        }

        return objArr;
    }
}
