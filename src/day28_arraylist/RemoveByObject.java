package day28_arraylist;

import java.util.ArrayList;

public class RemoveByObject {
    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(250);
        nums.add(1);
        nums.add(400);
        nums.add(500);
        nums.add(1);
        nums.add(600);
        nums.add(700);
        System.out.println(nums);//[100, 200, 250, 1, 400, 500, 1, 600, 700]


        //This removed object at index 1
        nums.remove(1);
        System.out.println(nums);//[100, 250, 1, 400, 500, 1, 600, 700]


        //this removes the first matching object that is 1 not an object at index 1
        Integer elem = 1;
        nums.remove(elem);
        System.out.println(nums);//[100, 250, 400, 500, 1, 600, 700]

        //nums.remove(500);// IndexOutOfBoundsException
        nums.remove((Integer)500);//Integer object 500
        System.out.println(nums);//[100, 250, 400, 1, 600, 700]

        nums.remove(Integer.valueOf("600"));//valueOf returns an object Integer 600 so converts "600" to Integer 600
        System.out.println(nums);//[100, 250, 400, 1, 700]

    }
}
