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
            if(each > max)
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

    /**
     * This methods adds a new element to the end of the array
     * @param originalArr - is an array of ints
     * @param elementToAdd is an int
     * @return returns a new array with an element added to it
     */
    public static int [] addElement(int [] originalArr, int elementToAdd)
    {
        int [] arr2 = Arrays.copyOf(originalArr, originalArr.length +1);

        arr2[arr2.length-1] = elementToAdd;


        //COULD ALSO BE DONE LIKE THIS
        /*
        // This is doing exactly the same thing above but using fori loop
    public static int [] addElemInArr2 (int [] origArr, int elemToAdd){


        int [] newArr = new int[origArr.length+1];


        for (int i = 0; i < origArr.length; i++) {
            newArr[i] = origArr[i];
        }
        // {1, 2, 3,  _ }
        newArr[newArr.length - 1] = elemToAdd;

        return newArr;
    }
         */

        return arr2;
    }

    /**
     * Method that accepts two int arrays and returns a combination of both
     * @param a - int array
     * @param b - int array
     * @return returns an int array that is a combination of 2 arrays
     */
    public static int [] combineArrays(int[] a, int[] b)
    {
        int [] combined = Arrays.copyOf(a, a.length + b.length);

        for (int i = a.length; i <combined.length ; i++) {
            combined[i] = b[i - a.length]; //starting i = 6, so 6-6 = 0, second iteration i = 7, so 7 - 6 = 1...
            //[3, 1, 5, 7, 3, 23, 24, 9, 5, 7, 3, 60]
        }

        return combined;
    }


    //TODO: create a reusable method that can take 2 String arrays and return one array combined

    /**
     * Method that accepts an int array and a number and returns an index of that number
     * @param arr - int array
     * @param num - int number
     * @return returns index of the number searched for if there is a match  or -1 if no match was found
     */
    public static int arrayIndexOf(int [] arr, int num)
    {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num)
            {
                return i;
            }
        }
        return -1;
    }
    /**
     * Method that accepts a String array and a number and returns an index of that number
     * @param arr - String array
     * @param word - String word
     * @return returns index of the String if there is a match  or -1 if no match was found
     */
    public static int arrayIndexOf(String [] arr, String word)
    {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(word))
            {
                return i;
            }
        }
        return -1;
    }

    /**
     * This method sums all the elements in array
     * @param arr - is the array where we take the elements
     * @return all elements summed up
     */
    public static int sum (int ... arr) //takes even whole numbers as an array, convenient no need to create an array just pass the numbers and it will return an array with those numbers
    {
        int sum = 0;
        for(int each: arr)
        {
            sum += each;
        }

        return sum;
    }
}
