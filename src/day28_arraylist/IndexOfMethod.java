package day28_arraylist;

import java.util.ArrayList;

public class IndexOfMethod {

    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>();

        nums.add(100);
        nums.add(200);
        nums.add(100);
        nums.add(500);
        nums.add(800);
        nums.add(100);
        System.out.println(nums);

        System.out.println(nums.indexOf(100));

        System.out.println(nums.indexOf(400));// returns -1 because there is no element 400 in the ArrayList

        int index = nums.indexOf(500);
        System.out.println(index);

        System.out.println(nums.lastIndexOf(100));
        nums.remove(nums.indexOf(100));
        System.out.println(nums);//[200, 100, 500, 800, 100]

        nums.set(nums.lastIndexOf(100),-100);//updated the last occurance of Integer object 100, with Integer object -100
        System.out.println(nums);//[200, 100, 500, 800, -100]
    }
}
