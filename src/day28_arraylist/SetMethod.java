package day28_arraylist;

import java.util.ArrayList;

public class SetMethod {

    public static void main(String[] args) {

        ArrayList <Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);
        System.out.println(nums);//[100, 200, 500, 800]

        nums.set(0, -100);//updated an object at index 0 with a new object
        System.out.println(nums);//[-100, 200, 500, 800]

        nums.set(nums.size()-1, 1000);
        System.out.println(nums);//[-100, 200, 500, 1000]

    }
}
