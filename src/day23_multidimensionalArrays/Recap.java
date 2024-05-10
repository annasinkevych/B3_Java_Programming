package day23_multidimensionalArrays;

import java.util.Arrays;

public class Recap {

    public static void main(String[] args) {
        int[] arr = {30, 90, 60, 360, 180};
        int[] arr2 = {180, 360, 30, 90, 60};


        //print arrays
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        Arrays.sort(arr);
        Arrays.sort(arr2);

        //compare 2 arrays --> returns boolean
        System.out.println("Compare after sorting: " + Arrays.equals(arr, arr2));

        //how to join the elements of an array
        String [] words = {"java", "selenium", "api", "db"};
        System.out.println(String.join(" ### ", words));

        //how to convert A string to String array  --> split
        String names = "Today is Thursday";
        System.out.println(names.split(" ")); //-- > can't print array like that prints memory address [Ljava.lang.String;@1fb3ebeb
        System.out.println(Arrays.toString(names.split(" ")));

        //how to convert String to char array
        String namess = "Today is Thursday";
        System.out.println(namess.toCharArray()); //EXCEPTION This will actually print it as a full String
        System.out.println(Arrays.toString(namess.toCharArray()));

    }
}
