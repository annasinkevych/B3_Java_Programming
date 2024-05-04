package day21_arrays;

import java.util.Arrays;

public class ForEachExample {


    public static void main(String[] args) {

        //WE USE FOREACH WITH COLLECTIONS AND DATA STRUCTURES
        //GOES FROM BEGINNING ALL TO THE WAY TO THE END SO MAY NOT BE SUITABLE FOR EVERY OPERATION


//        int [] num = new int []{3,4,5,7}; // since we have values here we do not to specify the size in the square brackets
//        int[] nums = new int[4]; //since we do not have curly braces with values we need to specify the size in the square brackets


        int []nums = {3,4,5,7};

        for(int i = 0; i < nums.length; i++)
        {
            System.out.println(nums[i]);
        }

        System.out.println("_____________");

        for(int eachElement: nums)
        {
            System.out.println(eachElement);
        }

        String [] classes = {"java" , "softskills", "selenium", "database", "api"};

//        for(int i = 0; i < classes.length; i++)
//        {
//            System.out.println(classes[i]);
//        }

        for(String eachEl: classes)
        {
            System.out.println(eachEl);
        }

        System.out.println();
        double [] nums2 = {23, 43, 34, 2};
        for (double each : nums2) {
            System.out.println("Foreach: " + each);
        }

        System.out.println();
        for (int i = 0; i < nums2.length; i++) {
            System.out.println("Fori: " + nums2[i]);

        }


        // The difference between fori and foreach loop when to use.
        String [] names = new String[4];

        for ( String each : names) {
            each = "Test";
        }
        System.out.println(Arrays.toString(names));

        for (int i = 0; i < names.length; i++) {
            names[i] = "Test";
        }
        System.out.println(Arrays.toString(names));
    }
}
