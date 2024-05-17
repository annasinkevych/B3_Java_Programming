package day23_multidimensionalArrays;

import java.util.Arrays;

public class BinarySearchExample {

    public static void main(String[] args) {
        int [] nums = {4, 10, 30, 100, 50};

        Arrays.sort(nums);
        //the array must be sorted
        System.out.println(Arrays.binarySearch(nums, 4)); //returns the position of searched element
        System.out.println(Arrays.binarySearch(nums, 100)); //returns the position of searched element
        System.out.println(Arrays.binarySearch(nums, 200)); //returns the position of searched element
    }
}