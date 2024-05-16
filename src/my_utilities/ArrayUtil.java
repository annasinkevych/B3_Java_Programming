package my_utilities;

import java.util.Arrays;

public class ArrayUtil {

    /**
     * This method returns the min number from array using sorted method
     * @param arr is a parameter that accepts array
     * @return the smallest number in the array
     */
    public static int minSortNumber(int [] arr)
    {
        Arrays.sort(arr); //smallest to biggest no need to assign to a variable
        return arr[0];
    }


    /**
     * Returns min number from array using foreach loop
     * @param arr – is a parameter that accepts array
     * @return the smallest number in the array
     */
    public static int minNumArray(int [] arr)
    {
        int min = arr[0];

        for(int each: arr)
        {
            if(each < min)
                min = each;
        }

        return min;
    }


    /**
     * This method returns the max number from array using sorted method
     * @param arr is a parameter that accepts array
     * @return the largest number in the array
     */
    public static int maxSortNumber(int [] arr)
    {
        Arrays.sort(arr); //smallest to biggest no need to assign to a variable
        return arr[arr.length-1];
    }

    /**
     * Returns max number from array using foreach loop
     * @param arr – is a parameter that accepts array
     * @return the largest number in the array
     */
    public static int maxNumArray(int [] arr)
    {
        int max = arr[0];

        for(int each: arr)
        {
            if(each < max)
                max = each;
        }

        return max;
    }

    /**
     * This methods checks if an int array contains a certain number
     * @param arr - is an array of ints
     * @param num - is a number that the method will be searching for in the array
     * @return a boolean - whether the number was found in the array or not
     */

    public static boolean contains(int [] arr, int num)
    {
        for(int each: arr)
        {
            if(each == num)
                return true;
        }
        return false; // in case no number was found in the array
    }
}
