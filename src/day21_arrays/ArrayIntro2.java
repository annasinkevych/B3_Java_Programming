package day21_arrays;

import java.util.Arrays;

public class ArrayIntro2 {

    public static void main(String[] args) {


        double [] arr = new double [4]; //you have declared and  array to hold double values and specified the length 4 elements of the array with the new keyword -- the length is always fixed, the array has to have a fixed length
        //prints [0.0, 0.0, 0.0, 0.0]
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length); //prints 4 --> array has 4 elements --> indexes are still 0,1,2,3

        arr[0] = 1.4;
        arr[1] = 39.22;
        arr[2] = 45.99;

        System.out.println(Arrays.toString(arr));

        double price = 1.99;
        int quantity  = 5;

        arr[3] = price * quantity;

        System.out.println(Arrays.toString(arr)); //we use this toString method to only print the array

        System.out.println(arr.length);

        //declared another array with arr.length + 1
        double [] arr2 = new double[arr.length+1];

        System.out.println(arr2.length);


        //reassigning
        arr[0] = 2000;
        System.out.println(Arrays.toString(arr));

        //so we created a bigger array and use the previous array name to point to it, we are losing all the data stored at the location the array was pointing to previously and now have a bigger array that is empty
        arr = new double[5];
        System.out.println(Arrays.toString(arr));





    }
}
