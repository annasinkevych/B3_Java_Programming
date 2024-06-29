package day22_array_methods;

import java.util.Arrays;

public class SortExample {

    public static void main(String[] args) {

        //sortin the array using .sort() method --> sorts the array from lower to the highest
        int [] nums = {2, 23, 56, 2, 45, -2, 555};

        int [] notSorted = nums; //we have created a new array reference and pointed it to the nums so any modifications made to the original array this reference will
        //point to the original and will show the differences. we did not create a new array object, we have created a reference or a pointer to an existing one


        int [] newArr = new int [nums.length];
        for (int i = 0; i < nums.length; i++) {
            newArr[i] = nums[i];
        }


        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);

        System.out.println(Arrays.toString(notSorted));

        System.out.println(Arrays.toString(newArr)); // this one was never modified or affected by the modifications of the nums array

    }
}
