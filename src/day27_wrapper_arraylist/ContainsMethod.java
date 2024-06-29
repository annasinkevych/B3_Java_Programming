package day27_wrapper_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ContainsMethod {

    public static void main(String[] args) {

        ArrayList <Integer> nums = new ArrayList<> ();

        nums.add(Integer.valueOf("200"));
        nums.add(100);
        nums.add(200);
        nums.add(300);

        System.out.println(nums);//[200, 100, 200, 300]

        /*
        Scanner key = new Scanner(System.in);

        String str = key.nextLine();

        String [] strArr = str.split(" ");
        String element = strArr[strArr.length-1];
        nums.add(Integer.valueOf(element));
        */

        nums.add(Integer.valueOf("250"));
        nums.add(Integer.valueOf("90"));

        System.out.println(nums.contains(200)); //returns true
        System.out.println(nums.contains(500)); //returns false
        System.out.println(nums); //[200, 100, 200, 300, 250, 90]
        System.out.println(nums.size()); //--> 6

        System.out.println(nums.isEmpty());//false
        nums.clear();
        System.out.println(nums.isEmpty()); //true when the arraylist is empty

    }
}
