package day21_arrays;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};

        int [] reversed = new int [arr.length];

        int len = arr.length;

        //we assign each value of the arr array in reversed order to reversed array starting at the last index of reversed array all the way to its index zero
        for (int i = 0; i < arr.length; i++) {
            reversed[arr.length-1 -i] = arr[i];


        }

        System.out.println(Arrays.toString(reversed));

//        for(int i = arr.length -1; i >-0; i--)
//        {
//            System.out.println(arr[i]);
//        }



//        System.out.println(Arrays.toString(arr));
    }
}
