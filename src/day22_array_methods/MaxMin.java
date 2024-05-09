package day22_array_methods;

import java.util.*;

public class MaxMin {

    /*

     */

    public static void main(String[] args) {

        //declare and assign an array

        int [] nums = {500, 120, -80, 90, 250, -10};

        //find the biggest number
        //int max = nums[0], min = nums[0];
        //or
        int max = Integer.MIN_VALUE; //assigning the min value that int can hold --> -2147483648
        int min = Integer.MAX_VALUE; //assigning the max value that int can hold --> 2147483647

        System.out.println(min);
        System.out.println(max);


        for(int each: nums)
        {
            if(each > max)
                max = each;

            if(each < min)
                min = each;
        }

        System.out.println(max);
        System.out.println(min);



    }
}
