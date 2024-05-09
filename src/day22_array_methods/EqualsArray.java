package day22_array_methods;

import java.util.Arrays;

public class EqualsArray {

    public static void main(String[] args) {
        //this method takes 2 arguments and compares to different array objects


        int [] a = {1,2,3,4,5};
        int [] b = {1,2,3,4,5};
        int [] c = a; //created a reference to array a
        Arrays.equals(a,b);

        System.out.println(Arrays.equals(a,b)); // returns true
        System.out.println( Arrays.equals(a,c)); //// returns true
        System.out.println( a ==c); //// returns true ONLY becasue both point to the same array object


    }
    }
